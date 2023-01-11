package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;
import Project.Forms.ManagerRegistration;

import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame{
    
    CustomButton addManagerButton, manageCustomerButton, productCatalogButton, logoutButton, addStoreButton;
    JPanel panel;

    AdminPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Admin Panel");
        setSize(300,400);
        setBackground(getForeground());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(4,1));

        addManagerButton = new CustomButton("Register Manager");
        manageCustomerButton = new CustomButton("Manage Customer");
        productCatalogButton = new CustomButton("View Product Catalog");
        logoutButton = new CustomButton("Logout");
        addStoreButton = new CustomButton("Add Store");

        panel.add(addManagerButton);
        panel.add(manageCustomerButton);
        panel.add(productCatalogButton);
        // panel.add(logoutButton);
        panel.add(addStoreButton);

        

        add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);


        MyActionListener listener = new MyActionListener();
        addManagerButton.addActionListener(listener);
        manageCustomerButton.addActionListener(listener);
        productCatalogButton.addActionListener(listener);
        logoutButton.addActionListener(listener);
        addStoreButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Register Manager")){
                ManagerRegistration reg = new ManagerRegistration();
            
            }

            if(ev.getActionCommand().equals("Manage Customer")){

            }

            if(ev.getActionCommand().equals("View Product Catalog")){

            }

            if(ev.getActionCommand().equals("Logout")){
                dispose();
            }

            if(ev.getActionCommand().equals("Add Store")){

            }
        }
    }

    public static void main(String[] args) {
        AdminPanel adminPanel = new AdminPanel();
    }

}
