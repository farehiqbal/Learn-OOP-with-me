package Project.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame{
    
    private JButton registerButton;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel locationLabel;
    private JPanel panel;
    private JTextField nameField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField locationField;

    public AdminPanel(){
        setTitle("Login");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        
    }
}
