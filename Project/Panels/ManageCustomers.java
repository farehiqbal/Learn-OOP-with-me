package Project.Panels;

import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Project.Users.*;
import Project.FileHandling.FileOperation;
import Project.Utils.Stringifies;

public class ManageCustomers extends JFrame{
    
    JTextArea textArea;
    JPanel panel;
    JLabel label;
    JTextField field;
    JButton button;

    public ManageCustomers() throws ClassNotFoundException, IOException{

        setVisible(true);
        setLayout(new GridLayout(3,1));
        setTitle("Manager Customers");
        setSize(550,400);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        textArea = new JTextArea(Stringifies.getCustomers());
        textArea.setEditable(false);
        textArea.setSize(550,400);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        label = new JLabel("Enter Customer ID");
        field = new JTextField();
        button = new JButton("Delete Customer");

        panel = new JPanel(new GridLayout(1,1));
        panel.add(label);
        panel.add(field);

        add(textArea);
        add(panel);
        add(button);

        MyActionListener listener = new MyActionListener();

        button.addActionListener(listener);
       

    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            String id = field.getText();
            if(ev.getActionCommand().equals("Delete Customer")){
                
                FileOperation<ArrayList<Customer>> file = new FileOperation<>("Project\\DataBase\\Customer");
                try {
                    ArrayList<Customer> customerList = file.pull();
                    for(int i = 0; i < customerList.size(); i++){
                        if(customerList.get(i).getCnic().equals(id)){
                            customerList.remove(i);
                            file.push(customerList);
                            JOptionPane.showMessageDialog(null, "Customer Deleted");
                            dispose();
                        }
                    }
                } catch (ClassNotFoundException | IOException e1) {
                    
                    e1.printStackTrace();
                }
                
            }
        }
    }
    
}
