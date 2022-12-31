package Project;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

import Project.Components.*;
import Project.Users.*;
import Project.Users.Customer;
import Project.Validations.*;
import Project.FileHandling.*;

public class CustomerRegistration extends JFrame{
    private CustomLabel cnicLabel, passwordLabel, confirmPasswordLabel, phoneLabel, addressLabel;
    private CustomField cnicField, phoneField, addressField;
    private CustomField passwordField, confirmPasswordField;
    private JRadioButton maleButton, femaleButton;
    private ButtonGroup genderGroup;
    private CustomButton submitButton;
    private CustomPanel panel;

    public CustomerRegistration() {

        setTitle("Customer Registration");
        setSize(450, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setBackground(Color.BLACK);
        setVisible(true);
        setLayout(new BorderLayout());
        // Set up the form widgets
        cnicLabel = new CustomLabel("CNIC: ");
        passwordLabel = new CustomLabel("Password: ");
        confirmPasswordLabel = new CustomLabel("Confirm Password: ");
        phoneLabel = new CustomLabel("Phone: ");
        addressLabel = new CustomLabel("Address: ");
        cnicField = new CustomField(13);
        passwordField = new CustomField(9);
        confirmPasswordField = new CustomField(9);
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        submitButton = new CustomButton("Submit");
        phoneField = new CustomField(15);
        addressField = new CustomField(30);
        panel = new CustomPanel();

        maleButton.setBackground(Color.DARK_GRAY);
        maleButton.setForeground(Color.WHITE);
        femaleButton.setForeground(Color.WHITE);
        femaleButton.setBackground(Color.DARK_GRAY);

        // Set up the gender radio buttons
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        

        // Lay out the widgets using a grid layout
        panel.setLayout(new GridLayout(6, 2, 5, 5));
        panel.setVisible(true);
        
        panel.add(cnicLabel);
        panel.add(cnicField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        // add(genderLabel);
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(addressLabel);
        panel.add(addressField);

        // add(topLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        CustomActionListener listener = new CustomActionListener();
        submitButton.addActionListener(listener);
    }

    class CustomActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            if(ev.getActionCommand().equals("Submit")){

                String cnic = cnicField.getText();
                if(!(Validate.verifyCNIC(cnic))) return;

                String pass = passwordField.getText();
                String c_pass = confirmPasswordField.getText();

                if(!Validate.passwordsMatch(pass, c_pass)) return;
                String gender;

                if(maleButton.isSelected()) gender = "Male";
                else gender = "Female";
                

                // int phone = Integer.parseInt(phoneField.getText());
                long phone = Long.parseLong(phoneField.getText());
                String address = addressField.getText();

                Customer cust = new Customer(cnic, pass, c_pass, gender, address, phone);

                
                FileOperations.writeToFile(cust, "Project\\DataBase\\Customer.ser");
                JOptionPane.showMessageDialog(null, "Customer Registered Successfully!");
                
                System.out.println(cust.toString());
                
            }
        }
    }
}