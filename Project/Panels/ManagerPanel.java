package Project.Panels;

import javax.swing.*;

import Project.Store;
import Project.Components.*;
import Project.Components.CustomLabel;
import Project.FileHandling.FileOperation;
import Project.Inventory.Inventory;
import Project.Products.Product;
import Project.Utils.Stringifies;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ManagerPanel extends JFrame{
    CustomButton updateButton;
    JPanel mainpanel, panel;
    CustomLabel productLabel, quantityLabel;
    CustomField productField, quantityField;
    Store store;

    ManagerPanel(Store store){
        this.store = store;
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Manager Panel");
        setSize(500,550);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setText(Stringifies.getStoreInventory(store));
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setSize(500,400);
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.WHITE);


        mainpanel = new JPanel(new GridLayout(2,1));
        mainpanel.setSize(500,150);
        panel = new JPanel(new GridLayout(2,2));
        panel.setSize(500,150);
        
        productLabel = new CustomLabel("Enter Product");
        quantityLabel = new CustomLabel("Enter Quantity");

        productField = new CustomField();
        quantityField = new CustomField();
        // panel.add(logoutButton);
        // panel.add(updateButton);
        panel.add(productLabel);
        panel.add(productField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        

        // mainpanel.add(textArea);
        mainpanel.add(panel);

        // logoutButton = new CustomButton("Logout");
        updateButton = new CustomButton("Update");

        add(mainpanel,BorderLayout.NORTH);
        add(textArea,BorderLayout.CENTER);
        add(updateButton,BorderLayout.SOUTH);


        MyActionListener listener = new MyActionListener();

        // logoutButton.addActionListener(listener);
        updateButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Update")){
                String pro = productField.getText();
                Integer quantity = Integer.parseInt(quantityField.getText());
                // Inventory inventory = store.getInventory();
                
                ArrayList<Product> products;
                try {
                    products = store.getAvailableProducts();
                    Product reqProduct = null;
                    for (Product product : products) {
                        if(product.getName().equals(pro)){
                            reqProduct = product;
                            break;
                    }
                }
                    FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
                    ArrayList<Store> stores = file.pull();

                    for (Store i : stores) {
                        if(i.getManager().getCnic().equals(store.getManager().getCnic())){
                            System.out.println("Found");
                            i.updateQuantity(reqProduct, quantity);
                            file.push(stores);
                            break;
                        }
                    }
                // System.out.println(reqProduct.getName())
                    // store.updateQuantity(reqProduct, quantity);

                } catch (ClassNotFoundException | IOException e1) {
                    e1.printStackTrace();
                }
                
                // Product product = products.get(pro);
                
            }

            // if(ev.getActionCommand().equals("Logout")){
            //     dispose();
            // }
        }
    }

    public static void main(String[] args) {
        // ManagerPanel managerPanel = new ManagerPanel();
    }
}
