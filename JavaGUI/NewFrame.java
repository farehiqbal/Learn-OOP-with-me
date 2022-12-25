package JavaGUI;

import javax.swing.*;
import java.awt.*;
// import javax.swing.*;
import java.awt.event.*;

public class NewFrame extends JFrame{
    
    JButton b1,b2,b3,b4,b5;
    
    NewFrame(){
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        

    }


    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
    }

}
