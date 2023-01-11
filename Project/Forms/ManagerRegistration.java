package Project.Forms;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

import Project.Components.*;
import Project.Users.Manager;
import Project.Validations.*;
import Project.FileHandling.*;

public class ManagerRegistration extends JFrame{
    private CustomLabel cnicLabel, passwordLabel, locationLabel, phoneLabel, addressLabel;
    private CustomField cnicField, phoneField, addressField;
    private CustomField passwordField, locationField;
    private JRadioButton maleButton, femaleButton;
    private ButtonGroup genderGroup;
    private CustomButton submitButton;
    private CustomPanel panel;

    public ManagerRegistration() {

        setTitle("Manager Registration");
        setSize(450, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setBackground(Color.BLACK);
        setVisible(true);
        setLayout(new BorderLayout());
        // Set up the form widgets
        cnicLabel = new CustomLabel("CNIC: ");
        passwordLabel = new CustomLabel("Password: ");
        locationLabel = new CustomLabel("City: ");
        phoneLabel = new CustomLabel("Phone: ");
        addressLabel = new CustomLabel("Address: ");
        cnicField = new CustomField(13);
        passwordField = new CustomField(9);
        locationField = new CustomField(9);
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
        panel.add(locationLabel);
        panel.add(locationField);
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
                String location = locationField.getText();

                // if(!Validate.passwordsMatch(pass, location)) return;
                
                String gender;

                if(maleButton.isSelected()) gender = "Male";
                else gender = "Female";
                

                // int phone = Integer.parseInt(phoneField.getText());
                long phone = Long.parseLong(phoneField.getText());
                String address = addressField.getText();

                Manager manager = new Manager(cnic, pass, location, gender, address, phone);
                
                // FileOperations.writeToFile(manager, "Project\\DataBase\\Manager.ser");
                FileOperation<Manager> fileOperation = new FileOperation<>("Project\\DataBase\\Manager");
                try {
                    fileOperation.push(manager);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Manager Registered Successfully!");
                
                System.out.println(manager.toString());
                
            }
        }
    }

    public static void main(String[] args) {
        ManagerRegistration managerRegistration = new ManagerRegistration();
    }
}