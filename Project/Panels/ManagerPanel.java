package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;

import java.awt.*;
import java.awt.event.*;

public class ManagerPanel extends JFrame{
    CustomButton viewInventoryButton, viewStoreButton, logoutButton;
    JPanel panel;

    ManagerPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Manager Panel");
        setSize(350,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(2,2));

        viewInventoryButton = new CustomButton("View Inventory");

        viewStoreButton = new CustomButton("View Store");

        logoutButton = new CustomButton("Logout");

        panel.add(viewInventoryButton);
        panel.add(viewStoreButton);
        

        add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);


        MyActionListener listener = new MyActionListener();
        viewInventoryButton.addActionListener(listener);

        viewStoreButton.addActionListener(listener);

        logoutButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("View Inventory")){

            }
            
            if(ev.getActionCommand().equals("View Store")){

            }

            if(ev.getActionCommand().equals("Logout")){
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        ManagerPanel managerPanel = new ManagerPanel();
    }
}
