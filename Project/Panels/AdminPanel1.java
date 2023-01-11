package Project.Panels;

import java.awt.*;
import javax.swing.*;

public class AdminPanel1 extends JFrame {

    private JButton addManagerButton;
    private JButton manageCustomerButton;
    private JButton viewProductCatalogButton;
    private JButton logoutButton;

    public AdminPanel1() {
        setTitle("Admin Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addManagerButton = new JButton("Add Manager");
        manageCustomerButton = new JButton("Manage Customer");
        viewProductCatalogButton = new JButton("View Product Catalog");
        logoutButton = new JButton("Logout");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addManagerButton);
        buttonPanel.add(manageCustomerButton);
        buttonPanel.add(viewProductCatalogButton);
        buttonPanel.add(logoutButton);

        add(buttonPanel, BorderLayout.CENTER);
    }

    // public static void main(String[] args) {
    //     AdminPanel1 adminPanel = new AdminPanel1();
    //     adminPanel.setVisible(true);
    // }
}
