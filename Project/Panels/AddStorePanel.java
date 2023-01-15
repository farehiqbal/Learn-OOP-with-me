package Project.Panels;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

import Project.Store;
import Project.FileHandling.FileOperation;
import Project.Users.Manager;

import java.awt.*;
import java.awt.event.*;


public class AddStorePanel extends JFrame{
    
    JPanel panel;
    JLabel location;
    JLabel cnic;
    JTextField locfield;
    JTextField cnicfield;
    JButton addButton;

    public AddStorePanel() throws ClassNotFoundException, IOException{

        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("Add New Store");
        setSize(400,200);
        setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(2,2));
        // panel = new JPanel(new FlowLayout());


        cnic = new JLabel("Enter Manager ID:");
        locfield = new JTextField();
        location = new JLabel("Enter Store Location:");
        cnicfield = new JTextField();
        addButton = new JButton("Add Store");

        panel.add(location);
        panel.add(locfield);
        panel.add(cnic);
        panel.add(cnicfield);

        add(panel,BorderLayout.CENTER);
        
        add(addButton,BorderLayout.SOUTH);


        MyActionListener listener = new MyActionListener();
        addButton.addActionListener(listener);
    }

    class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){

            String cnicfieldString = cnicfield.getText();
            String locfieldString = locfield.getText();

            FileOperation<ArrayList<Manager>> file = new FileOperation<>("Project\\DataBase\\Manager");
            
            ArrayList<Manager> arrayList = new ArrayList<>();
            try {
                arrayList = file.pull();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Manager tempManager = null;

            if(ev.getActionCommand().equals("Add Store")){
                for (Manager manager : arrayList) {
                    if(cnicfieldString.equals(manager.getCnic()) && locfieldString.equals(manager.getLocation())){
                        tempManager = manager;
                        JOptionPane.showMessageDialog(null, "Store Added");
                    }   
                }
                if(tempManager == null){
                    JOptionPane.showMessageDialog(null,"Add manager first");
                }
                Store store = new Store(tempManager,locfieldString);

                FileOperation<ArrayList<Store>> storeFile = new FileOperation<>("Project\\DataBase\\Store");

                ArrayList<Store> aList = new ArrayList<>();
                try {
                    aList = storeFile.pull();
                    aList.add(store);
                    storeFile.push(aList);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

           

            }
        
         }
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        AddStorePanel addStorePanel = new AddStorePanel();
    }
}
