package GradedTasks;

import javax.swing.*;

import Lab_Assignment3.FileOperations;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteStudent extends JFrame{
    private JLabel regLabel;
    private JButton searchButton, homeButton;
    private JTextField regField;
    
    DeleteStudent(){
        setTitle("Delete Student");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2,2,5,5));

        regLabel = new JLabel("Enter reg. no: ");
        searchButton = new JButton("Delete");
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

            if(ev.getActionCommand().equals("Delete")){
                // System.out.println(regLabel.getText());
                try{
                    FileOperations.DeleteAStudent(regField.getText(), "test.ser");
                    JOptionPane.showMessageDialog(null, "Deletion Sucess");
                }
                catch(FileNotFoundException e){
                    System.out.println("File not found");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if(ev.getActionCommand().equals("Home")){
                Operations operations = new Operations();
                dispose();
            }
            
        }
    }
}
