package JavaGUI;

import javax.swing.*;
import java.awt.*;
// import javax.swing.*;
import java.awt.event.*;

public class SampleGUI{
    JFrame frame, adminFrame;
    JButton addButton, subButton, mulButton, divButton;
    JTextField text1, text2;
    JLabel field1Label, field2Label;

    public SampleGUI(){
        // AdminFrame admin = new AdminFrame();
        // admin.setVisible(true);

        frame = new JFrame("Calculator");
        frame.setSize(400,400);
        // frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,2));
        // GridLayout.setBounds(400,200);
        

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");

        field1Label = new JLabel("Enter first number");
        // field1Label.setBounds(50, 200, 10, 10);
        text1 = new JTextField();
        // num1.setBounds()

        field2Label = new JLabel("Enter second number");
        text2 = new JTextField();
        

        MyActionListener a = new MyActionListener();
        addButton.addActionListener(a);
        subButton.addActionListener(a);
        mulButton.addActionListener(a);
        divButton.addActionListener(a);
        
        

        frame.add(field1Label);
        frame.add(text1);
        frame.add(field2Label);
        frame.add(text2);

        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);


    }
    public class AdminFrame extends JFrame{
        JButton enter;
        JTextField username, password;
        JLabel userLabel, passLabel;

        
        AdminFrame(){

            setSize(300,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(3,1));
            setVisible(true);

            userLabel = new JLabel("Enter Username");
            passLabel = new JLabel("Enter Password");
            username = new JTextField();
            password = new JTextField();
            enter = new JButton("Submit");

            MyActionListener a = new MyActionListener();
            enter.addActionListener(a);
    
            add(userLabel);
            add(username);
            add(passLabel);
            add(password);
            add(enter);
        }

    }


    class MyActionListener implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent ae){
            
            if(ae.getActionCommand().equals("Add")){
                
                // String label1 = field1Label.getText();
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
    
            // Perform the addition
                double result = num1 + num2;
    
            // Display the result
                JOptionPane.showMessageDialog(new JFrame(), "The result is " + result);
    
            }
            else if(ae.getActionCommand().equals("Subtract")){
                
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
    
            // Perform the addition
                double result = num1 - num2;
    
            // Display the result
                JOptionPane.showMessageDialog(new JFrame(), "The result is " + result);
    
            }
            else if(ae.getActionCommand().equals("Multiply")){
                
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
    
            // Perform the addition
                double result = num1 * num2;
    
            // Display the result
                JOptionPane.showMessageDialog(new JFrame(), "The result is " + result);
    
            }
            else if(ae.getActionCommand().equals("Divide")){
                
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
    
            // Perform the addition
                double result = num1 / num2;
    
            // Display the result
                JOptionPane.showMessageDialog(new JFrame(), "The result is " + result);
    
            }
            else if(ae.getActionCommand().equals("Submit")){
                
                // AdminFrame adminFrame = new AdminFrame();


                // String s1 = username.getText();
                // String s2 = password.getText();
    
                // if(s1.equals("admin") && s2.equals("admin123")){
                //     adminFrame.dispose();
                //     SampleGUI gui = new SampleGUI();

                // }
    
            }
        }
    }
}

