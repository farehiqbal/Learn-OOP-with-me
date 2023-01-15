package Project.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Project.Store;
import Project.Components.*;
import Project.FileHandling.FileOperation;
import Project.Forms.CustomerRegistration;
import Project.Users.Customer;
import Project.Users.Manager;
import Project.Validations.Validate;


public class LoginPanel extends JFrame {

  private CustomButton adminButton;
  private CustomButton managerButton;
  private CustomButton customerButton;
  private CustomLabel usernameLabel;
  private CustomLabel passwordLabel;
  private CustomPanel panel;
  private CustomField usernameField;
  private CustomField passwordField;
  private CustomButton regButton;
  

  public LoginPanel() {
    // Set up the frame
    setTitle("Login");
    setVisible(true);
    setSize(400, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    // Create the panel and add the components
    panel = new CustomPanel();
    panel.setLayout(new GridLayout(4, 2, 5, 5));

    usernameLabel = new CustomLabel("    Username: ");
    panel.add(usernameLabel);

    usernameField = new CustomField(20);
    panel.add(usernameField);

    passwordLabel = new CustomLabel("    Password: ");
    panel.add(passwordLabel);

    passwordField = new CustomField(20);
    panel.add(passwordField);

    adminButton = new CustomButton("Admin Login");
    adminButton.setFocusable(false);
    panel.add(adminButton);

    managerButton = new CustomButton("Manager Login");
    managerButton.setFocusable(false);
    panel.add(managerButton);

    customerButton = new CustomButton("Customer Login");
    customerButton.setFocusable(false);
    panel.add(customerButton);

    regButton = new CustomButton("Register new Customer");
    regButton.setForeground(Color.RED);
    regButton.setFocusable(false);
    panel.add(regButton);

    // Add the panel to the frame
    add(panel);

    MyActionListener listener = new MyActionListener();
    adminButton.addActionListener(listener);
    managerButton.addActionListener(listener);
    customerButton.addActionListener(listener);
    regButton.addActionListener(listener);
  

  }

  class MyActionListener implements ActionListener{

    public void actionPerformed(ActionEvent ev){

        if(ev.getActionCommand().equals("Admin Login")){
            
            if(usernameField.getText().equals("admin") && passwordField.getText().equals("admin123")){
                AdminPanel admin = new AdminPanel();
                // admin.isAlwaysOnTop();
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong credentials!");
            }
        }

        if(ev.getActionCommand().equals("Manager Login")){
          
          String username = usernameField.getText();
          String password = passwordField.getText();

         
          try {
            FileOperation<ArrayList<Manager>> fileOperation = new FileOperation<>("Project\\DataBase\\Manager");
            FileOperation<ArrayList<Store>> storeFile = new FileOperation<>("Project\\DataBase\\Store");
            ArrayList<Store> storeList = storeFile.pull();
            ArrayList<Manager> list;
            list = fileOperation.pull();
            Manager tempManager = null;
            Store tempStore =null;
            for (Manager manager : list) {
              if(manager.getCnic().equals(username) && manager.getPassword().equals(password)){
                  tempManager = manager;
                  Store s = Validate.checkForStore(username, manager.getLocation());
                  
                  if(s != null){
                    tempStore = s;
                }
                
                JOptionPane.showMessageDialog(null, "Welcome!");
                System.out.println(tempManager.toString());
                System.out.println(tempStore.toString());
                ManagerPanel panel = new ManagerPanel(tempStore);
                break;
              }
            }

          } catch (ClassNotFoundException | IOException e) {
            
            e.printStackTrace();
          }
          
        }

        if(ev.getActionCommand().equals("Customer Login")){
          String username = usernameField.getText();
          String password = passwordField.getText();

         
          try {
            FileOperation<ArrayList<Customer>> fileOperation = new FileOperation<>("Project\\DataBase\\Customer");

            ArrayList<Customer> list;
            list = fileOperation.pull();

            for (Customer customer: list) {
              Customer tempCustomer = null;
              if(customer.getCnic().equals(username) && customer.getPassword().equals(password)){
                tempCustomer = customer;
                JOptionPane.showMessageDialog(null, "Welcome!");
                System.out.println(tempCustomer.toString());
                CustomerPanel customerPanel = new CustomerPanel(tempCustomer);
              }
            }

          } catch (ClassNotFoundException | IOException e) {
            
            e.printStackTrace();
          }
        }

        if(ev.getActionCommand().equals("Register new Customer")){
            CustomerRegistration reg = new CustomerRegistration();
        }
    }
  }
  
}
