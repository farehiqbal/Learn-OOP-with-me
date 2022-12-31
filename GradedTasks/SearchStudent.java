package GradedTasks;

import javax.swing.*;

import Lab_Assignment3.FileOperations;

import java.awt.*;
import java.awt.event.*;

public class SearchStudent extends JFrame{
    private JLabel regLabel;
    private JButton searchButton, homeButton;
    private JTextField regField;
    
    SearchStudent(){
        setTitle("Search Student");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,2,5,5));

        regLabel = new JLabel("Enter reg. no: ");
        searchButton = new JButton("Search");
        homeButton = new JButton("Home");
        regField = new JTextField();

        add(regLabel);
        add(regField);
        add(searchButton);
        add(homeButton);

        MyActionListener a = new MyActionListener();
        searchButton.addActionListener(a);
        homeButton.addActionListener(a);


    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Search")){
                System.out.println(regField.getText());
                if(FileOperations.SearchStudent(regField.getText(), "test.ser")){
                    JOptionPane.showMessageDialog(null, "Found");
                }
            }

            if(ev.getActionCommand().equals("Home")){
                Operations operations = new Operations();
                dispose();
            }
        }
    }
}
