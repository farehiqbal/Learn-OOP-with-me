package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;
import Project.Forms.ManagerRegistration;
import Project.Utils.Stringifies;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class AdminPanel extends JFrame{
    
    CustomButton viewManagerButton, registerManagerButton, manageCustomerButton, productCatalogButton, addStoreButton, viewStoreButton, logoutButton;
    JPanel panel;

    AdminPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Admin Panel");
        setSize(350,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(3,3));

        viewManagerButton = new CustomButton("View Managers");
        registerManagerButton = new CustomButton("Register Manager");
        manageCustomerButton = new CustomButton("Manage Customer");
        productCatalogButton = new CustomButton("View Product Catalog");
        viewStoreButton = new CustomButton("View Stores");
        addStoreButton = new CustomButton("Add Store");
        logoutButton = new CustomButton("Logout");

        panel.add(viewManagerButton);
        panel.add(registerManagerButton);
        panel.add(manageCustomerButton);
        panel.add(productCatalogButton);
        panel.add(viewStoreButton);
        panel.add(addStoreButton);

        add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);

        MyActionListener listener = new MyActionListener();
        viewManagerButton.addActionListener(listener);
        registerManagerButton.addActionListener(listener);
        manageCustomerButton.addActionListener(listener);
        productCatalogButton.addActionListener(listener);
        viewManagerButton.addActionListener(listener);
        addStoreButton.addActionListener(listener);
        logoutButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("View Managers")){
                
                JFrame frame = new JFrame("Available Managers");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(550, 400);
                frame.setLayout(new BorderLayout());

                try {
                    JTextArea textArea = new JTextArea();
                    // textArea.setText("");
                    textArea.setText(Stringifies.getManagers());
                    textArea.setEditable(false);
                   
                    textArea.setFont(new Font("Arial", Font.PLAIN, 14));
                    textArea.setSize(550,400);

                    frame.add(textArea, BorderLayout.CENTER);
                    frame.setVisible(true);

                } catch (ClassNotFoundException | IOException e) {
                    e.printStackTrace();
                }
                
                

                
            }

            if(ev.getActionCommand().equals("Register Manager")){
                ManagerRegistration reg = new ManagerRegistration();
            
            }
            
            if(ev.getActionCommand().equals("Manage Customer")){
                try {
                    ManageCustomers manageCustomers = new ManageCustomers();
                } catch (ClassNotFoundException | IOException e) {
                    e.printStackTrace();
                }
            }
            
            if(ev.getActionCommand().equals("View Product Catalog")){
                try {
                    ViewProductCatalog catalog = new ViewProductCatalog();
                } catch (ClassNotFoundException | IOException e) {
                    e.printStackTrace();
                }
            }

            if(ev.getActionCommand().equals("View Stores")){

            }

            if(ev.getActionCommand().equals("Add Store")){

            }

            if(ev.getActionCommand().equals("Logout")){
                dispose();
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // AdminPanel adminPanel = new AdminPanel();
        System.out.println(Stringifies.getManagers());
    }

}
