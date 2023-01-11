package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;

import java.awt.*;
import java.awt.event.*;

public class CustomerPanel extends JFrame{
    CustomButton viewCartButton, logoutButton;
    JPanel panel;

    CustomerPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Customer Panel");
        setSize(350,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(3,3));

        viewCartButton = new CustomButton("View Cart");

        logoutButton = new CustomButton("Logout");

        panel.add(viewCartButton);


        

        add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);


        MyActionListener listener = new MyActionListener();
        viewCartButton.addActionListener(listener);

        logoutButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("View Cart")){

            }
            

            if(ev.getActionCommand().equals("Logout")){
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        CustomerPanel customerPanel = new CustomerPanel();
    }
}
