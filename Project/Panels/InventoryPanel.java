package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;

import java.awt.*;
import java.awt.event.*;

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

            }
            
            if(ev.getActionCommand().equals("Remove from Inventory")){

            }

            if(ev.getActionCommand().equals("Display Inventory")){

            }
        
         }
    }
    public static void main(String[] args) {
        InventoryPanel inventoryPanel = new InventoryPanel();
    }
}
