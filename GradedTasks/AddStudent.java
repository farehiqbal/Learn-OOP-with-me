package GradedTasks;

import javax.swing.*;

// import LabAssignment3.FileOperations;
// import LabAssignment3.Student;
import Lab_Assignment3.*;

import java.awt.*;
import java.awt.event.*;

public class AddStudent extends JFrame{
    private JLabel name;
    private JLabel email;
    private JLabel gender;
    private JLabel regNo;
    private JLabel gpa;
    private JLabel semster;
    private JLabel deptName, deptLocation;
    private JTextField nameField, emailField, genderField, regNoField, gpaField, semField, deptNameField, deptLocationField;
    private JPanel panel;
    private JButton submit;

    AddStudent(){

        setTitle("Menu");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        panel = new JPanel(new GridLayout(7,2));
        name = new JLabel("Name");
        email = new JLabel("Email");
        gender = new JLabel("Gender");
        regNo = new JLabel("RegNO");
        deptName = new JLabel("Department Name: ");
        deptLocation = new JLabel("Department Location");

        nameField = new JTextField();
        emailField = new JTextField();
        genderField = new JTextField();
        regNoField = new JTextField();
        deptNameField = new JTextField();
        deptLocationField = new JTextField();

        submit = new JButton("Submit");

        panel.add(name);
        panel.add(nameField);
        panel.add(email);
        panel.add(emailField);
        panel.add(gender);
        panel.add(genderField);
        panel.add(regNo);
        panel.add(regNoField);
        panel.add(deptName);
        panel.add(deptNameField);
        panel.add(deptLocation);
        panel.add(deptLocationField);

        add(panel, BorderLayout.CENTER);
        add(submit, BorderLayout.SOUTH);

        

        MyActionListener a = new MyActionListener();
        submit.addActionListener(a);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            if(ev.getActionCommand().equals("Submit")){
                
                String name = nameField.getText();
                String email = emailField.getText();
                String gender = genderField.getText();
                String regno = regNoField.getText();
                String deptName = deptNameField.getText();
                String deptLocation = deptLocationField.getText();

                Department dept = new Department(deptName, deptLocation);

                Student_lab student = new Student_lab(name, email, gender,regno, 3, 3, dept);
                FileOperations.writeToFile(student);

                JOptionPane.showMessageDialog(null, "Added successfully");
                dispose();
            }
        }
    }

}
