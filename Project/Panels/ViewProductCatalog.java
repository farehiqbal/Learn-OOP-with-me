package Project.Panels;

import javax.swing.*;
import Project.Components.*;
import Project.Utils.Stringifies;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class ViewProductCatalog extends JFrame{
    
    JTextArea textArea;
    JPanel panel;
    CustomButton add, remove, update;

    public ViewProductCatalog() throws ClassNotFoundException, IOException{
        
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("View Product Catalog");
        setSize(520,500);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        textArea = new JTextArea(Stringifies.getProductCatalog());
        textArea.setEditable(false);
        textArea.setSize(520,470);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));

        CustomButton add = new CustomButton("Add");
        CustomButton remove = new CustomButton("Remove");
        CustomButton update = new CustomButton("Update");

        panel = new JPanel(new FlowLayout());
        panel.add(add);
        panel.add(remove);
        panel.add(update);

        add(textArea, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        MyActionListener listener = new MyActionListener();

        add.addActionListener(listener);
        remove.addActionListener(listener);
        update.addActionListener(listener);
       

    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if(ev.getActionCommand().equals("Add")){
                
            }
            if(ev.getActionCommand().equals("Remove")){
                
            }
            if(ev.getActionCommand().equals("Update")){
                
            }

        }
    }
}
