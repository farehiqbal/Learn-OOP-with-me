package JavaGUI.ColorSpam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    
    JButton b1, b2, b3;
    JPanel p1, p2, p3, p4, p5;

    MainFrame(){
        setLayout(new BorderLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1,3));

        p5.add(p1);
        p5.add(p2);
        p5.add(p3);

        add(p5, BorderLayout.CENTER);
        // add(p2, BorderLayout.CENTER);
        // add(p3, BorderLayout.CENTER);
        add(p4, BorderLayout.SOUTH);

        b1 = new JButton("Green");
        b2 = new JButton("Blue");
        b3 = new JButton("Red");

        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);

        p4.add(b1);
        p4.add(b2);
        p4.add(b3);

    }

    class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ev){

            if(ev.getActionCommand().equals("Green")){
                p1.setBackground(Color.GREEN);
            }
            if(ev.getActionCommand().equals("Blue")){
                p2.setBackground(Color.BLUE);
            }
            if(ev.getActionCommand().equals("Red")){
                p3.setBackground(Color.RED);
                
                
            }
        }
    }
}
