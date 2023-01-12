package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;
import Project.FileHandling.FileOperation;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.util.HashMap;
import java.io.*;
import Project.Products.*;
import Project.Inventory.*;

public class InventoryPanel extends JFrame{
    CustomButton addProductButton, removeProductButton, displayInventoryButton;
    JPanel panel;

    InventoryPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Customer Panel");
        setSize(350,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(3,3));

        addProductButton = new CustomButton("Add to Inventory");

        removeProductButton = new CustomButton("Remove from Inventory");

        displayInventoryButton = new CustomButton("Display Inventory");

        panel.add(addProductButton);
        panel.add(removeProductButton);
        panel.add(displayInventoryButton);

        // add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);


        MyActionListener listener = new MyActionListener();
        addProductButton.addActionListener(listener);

        removeProductButton.addActionListener(listener);

        displayInventoryButton.addActionListener(listener);
    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Add to Inventory")){
                FileOperation<HashMap<Product,Boolean>> file = new FileOperation<HashMap<Product,Boolean>>("Project\\DataBase\\Inventory");

                try {
                    file.push(readyMadeInventory());
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
                Inventory inventory = new Inventory();
                Product apple = new Apple();
                inventory.addIntoInventory(apple, null); 
            }
            

            if(ev.getActionCommand().equals("Remove from Inventory")){
                FileOperation<HashMap<Product,Boolean>> file = new FileOperation<HashMap<Product,Boolean>>("Project\\DataBase\\Inventory");

                try {
                    file.push(readyMadeInventory());
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
                Inventory inventory = new Inventory();
                Product apple = new Apple();
                inventory.removeFromInventory(apple, null);   
            }

            if(ev.getActionCommand().equals("Display Inventory")){
                // JFileChooser fileChooser = new JFileChooser();
                // fileChooser.showOpenDialog(null);
                // File file = new File("Project\\DataBase\\Inventory");
                // String fileName = file.getAbsolutePath();

                // try {
                //     FileReader fileReader = new FileReader(fileName);
                //     BufferedReader bufferedReader = new BufferedReader(fileReader);


                // } catch (Exception e) {
                //     JOptionPane.showMessageDialog(null,e);
                // }

            }
        }
    }

    public static void main(String[] args) {
        InventoryPanel inventoryPanel = new InventoryPanel();
    }
}
