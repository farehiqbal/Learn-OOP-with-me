package GradedTasks;

// package GradedTasks;

import javax.swing.*;

import Lab_Assignment3.FileOperations;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UpdateStudent extends JFrame{
    private JLabel OldregLabel, newregLabel;
    private JButton searchButton, homeButton;
    private JTextField regField, newregField;
    
    UpdateStudent(){
        setTitle("Update Student");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3,2,5,5));

        OldregLabel = new JLabel("Enter old reg. no: ");
        searchButton = new JButton("Update");
        homeButton = new JButton("Home");
        regField = new JTextField();

        newregLabel = new JLabel("Enter new Reg no: ");
        newregField = new JTextField();

        add(OldregLabel);
        add(regField);
        add(newregLabel);
        add(newregField);
        add(searchButton);
        add(homeButton);

        MyActionListener a = new MyActionListener();
        searchButton.addActionListener(a);
        homeButton.addActionListener(a);


    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Update")){
                
                // System.out.println(regLabel.getText());
                String oldreg = regField.getText();
                String newreg = newregField.getText();
                
                FileOperations.UpdateReg(oldreg, "test.ser", newreg);
                JOptionPane.showMessageDialog(null, "Update Sucess");
            
        
            }

            if(ev.getActionCommand().equals("Home")){
                Operations operations = new Operations();
                dispose();
            }
            
        }
    }
}

