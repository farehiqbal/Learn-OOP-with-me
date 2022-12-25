package JavaGUI.StudentEntryFrom;

import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;


public class Frame extends JFrame{
    
    JPanel p1, p2, p3, p4;
    JLabel l1, l2, l3, l4, l5;
    JTextField name, regNO, email, address;
    JButton b1, b2, b3;

    Frame(){
        setLayout(new BorderLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.DARK_GRAY);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setLayout(new FlowLayout());
        p2.setLayout(new GridLayout(4,2));
        p3.setLayout(new FlowLayout());

        p1.setBackground(Color.DARK_GRAY);
        p2.setBackground(Color.DARK_GRAY);
        p3.setBackground(Color.DARK_GRAY);

        l1 = new JLabel("STUDENT ENTRY FORM");
        l1.setForeground(Color.WHITE);
        l2 = new JLabel("Name: ");
        l2.setForeground(Color.WHITE);
        l3 = new JLabel("Reg NO: ");
        l3.setForeground(Color.WHITE);
        l4 = new JLabel("Email: ");
        l4.setForeground(Color.WHITE);
        l5 = new JLabel("Address: ");
        l5.setForeground(Color.WHITE);

        name = new JTextField();
        regNO = new JTextField();
        email = new JTextField();
        address = new JTextField();

        b1 = new JButton("Submit");
        b2 = new JButton("Exit");
        b3 = new JButton("Contact Us");

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        p1.add(l1);
        p2.add(l2);
        p2.add(name);
        p2.add(l3);
        p2.add(regNO);
        p2.add(l4);
        p2.add(email);
        p2.add(l5);
        p2.add(address);

        p3.add(b1);
        p3.add(b2);
        p3.add(b3);



    }
}
