package Project.Panels;

import javax.swing.*;

import Project.Components.CustomButton;

import java.awt.*;
import java.awt.event.*;

public class ManagerPanel extends JFrame{
    CustomButton viewInventoryButton, logoutButton;
    JPanel panel;

    ManagerPanel(){
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Manager Panel");
        setSize(350,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(3,3));

        viewInventoryButton = new CustomButton("View Inventory");

        logoutButton = new CustomButton("Logout");

        panel.add(viewInventoryButton);


        

        add(logoutButton,BorderLayout.SOUTH);
    
        add(panel,BorderLayout.CENTER);


        MyActionListener listener = new MyActionListener();
        viewInventoryButton.addActionListener(listener);

        logoutButton.addActionListener(listener);

    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("View Inventory")){

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
