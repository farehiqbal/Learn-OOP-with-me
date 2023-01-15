package Project.Panels;

import javax.swing.*;

import Project.OnlineShopping;
import Project.Store;
import Project.Components.CustomButton;
import Project.Components.CustomLabel;
import Project.Products.Product;
import Project.Users.Customer;
import Project.Utils.Stringifies;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class CustomerPanel extends JFrame{
    // Customer customer;
    CustomButton viewCartButton;
    JPanel panel, centrePanel;
    CustomLabel locationLabel;
    JTextArea itemsArea;
    CustomButton addButton, removeButton;
    OnlineShopping onlineShopping;
    Store tempStore;

    CustomerPanel(Customer customer) throws ClassNotFoundException, IOException{
        tempStore = Store.getStore(customer.getLocation());
        onlineShopping = new OnlineShopping(customer);
        
        if(tempStore == null){
            JOptionPane.showMessageDialog(null, "No Store in your area");
            dispose();
        }

        if(tempStore.getLocation().equals(customer.getLocation())){
            System.out.println("Store Found");
        }

        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Customer Panel");
        setSize(500,550);
        setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        locationLabel = new CustomLabel("Nearest Store " + customer.getLocation());
        locationLabel.setBackground(Color.DARK_GRAY);
        locationLabel.setForeground(Color.BLACK);
        locationLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        itemsArea = new JTextArea(Stringifies.getStoreInventory(tempStore));
        itemsArea.setEditable(false);
        itemsArea.setSize(500,450);
        itemsArea.setFont(new Font("Arial", Font.PLAIN, 14));
        itemsArea.setBackground(Color.DARK_GRAY);
        itemsArea.setForeground(Color.WHITE);

        // JScrollPane scrollPane = new JScrollPane(itemsArea);
        // scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // scrollPane.setPreferredSize(new Dimension(500, 500));

        addButton = new CustomButton("Add to Cart");
        removeButton = new CustomButton("Remove from Cart");
        viewCartButton = new CustomButton("View Cart");

        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setForeground(Color.WHITE);
        panel.add(addButton);
        panel.add(removeButton);

        centrePanel = new JPanel();
        centrePanel.add(itemsArea);
        centrePanel.add(panel);

        add(locationLabel, BorderLayout.NORTH);
        add(centrePanel, BorderLayout.CENTER);
        add(viewCartButton, BorderLayout.SOUTH);

        MyActionListener listener = new MyActionListener();
        viewCartButton.addActionListener(listener);
        addButton.addActionListener(listener);
        removeButton.addActionListener(listener);


    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Add to Cart")){
                
                String item = JOptionPane.showInputDialog("Enter Item Name");
                Integer quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));
                Product product = null;
                try {
                    for(Product p : tempStore.getAvailableProducts()){
                        if(p.getName().equals(item)){
                            product = p;
                            break;
                        }
                    }

                    onlineShopping.addToCart(product, quantity);
                } catch (ClassNotFoundException | IOException e) {
                    
                    e.printStackTrace();
                }

               
            }

            if(ev.getActionCommand().equals("View Cart")){
                
                JFrame cartFrame = new JFrame();
                cartFrame.setVisible(true);
                cartFrame.setLayout(new BorderLayout());
                cartFrame.setTitle("Cart");
                cartFrame.setSize(500,550);
                cartFrame.setBackground(Color.DARK_GRAY);
                cartFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                JTextArea cartArea = new JTextArea(onlineShopping.printMap());
                cartArea.setEditable(false);
                cartArea.setSize(500,450);
                cartArea.setFont(new Font("Arial", Font.PLAIN, 14));
                cartArea.setBackground(Color.DARK_GRAY);
                cartArea.setForeground(Color.WHITE);

                

                CustomButton checkoutButton = new CustomButton("Checkout");
                checkoutButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        try {
                            onlineShopping.checkout();

                        } catch (ClassNotFoundException | IOException e) {
                            
                            e.printStackTrace();
                        }
                    }
                });

                cartFrame.add(cartArea, BorderLayout.CENTER);
                cartFrame.add(checkoutButton, BorderLayout.SOUTH);
                cartFrame.add(new JLabel(onlineShopping.getTotalPrice()), BorderLayout.NORTH);
            }
            
        }
    }

    public static void main(String[] args) {
        // CustomerPanel customerPanel = new CustomerPanel();
    }
}
