package Project.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Project.Components.*;
import Project.Forms.CustomerRegistration;


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
    setSize(400, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

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

        }

        if(ev.getActionCommand().equals("Customer Login")){

        }

        if(ev.getActionCommand().equals("Register new Customer")){
            CustomerRegistration reg = new CustomerRegistration();
        }
    }
  }
  
}
