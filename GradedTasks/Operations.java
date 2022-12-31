package GradedTasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Lab_Assignment3.*;

public class Operations extends JFrame{
  
    JButton addButton, searchButton, deleteButton, updateButton;
    JPanel panel;

    Operations(){

        setTitle("Menu");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        addButton = new JButton("Add Student");
        searchButton = new JButton("Search Student");
        deleteButton = new JButton("Update Student");
        updateButton = new JButton("Delete Student");

        panel = new JPanel(new GridLayout(4,1));
        panel.add(addButton);
        panel.add(searchButton);
        panel.add(deleteButton);
        panel.add(updateButton);

        add(panel);
        // pack();

        MyActionListener event = new MyActionListener();

        addButton.addActionListener(event);
        searchButton.addActionListener(event);
        deleteButton.addActionListener(event);
        updateButton.addActionListener(event);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            if(ev.getActionCommand().equals("Add Student")){
                AddStudent add = new AddStudent();
            }
            if(ev.getActionCommand().equals("Search Student")){
                SearchStudent search = new SearchStudent();

            }

            if(ev.getActionCommand().equals("Delete Student")){
                DeleteStudent delete = new DeleteStudent();
            }

            if(ev.getActionCommand().equals("Update Student")){
                UpdateStudent update = new UpdateStudent();
            }
            
        }
    }
}

