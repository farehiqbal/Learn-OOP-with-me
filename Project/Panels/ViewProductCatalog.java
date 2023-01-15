package Project.Panels;

import javax.swing.*;
import Project.Components.*;
import Project.FileHandling.FileOperation;
import Project.Products.Product;
import Project.Utils.Stringifies;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.HashMap;


public class ViewProductCatalog extends JFrame{
    
    JTextArea textArea;
    JPanel panel;
    CustomButton add, remove, update;

    public ViewProductCatalog() throws ClassNotFoundException, IOException{
        
        setVisible(true);
        setLayout(new BorderLayout());
        setTitle("View Product Catalog");
        setSize(420,500);
        setBackground(getForeground());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        textArea = new JTextArea(Stringifies.getProductCatalog());
        textArea.setEditable(false);
        textArea.setSize(420,470);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.white);

        CustomButton state = new CustomButton("Change State");
        // CustomButton remove = new CustomButton("Remove");
        // CustomButton update = new CustomButton("Update");

        // panel = new JPanel(new FlowLayout());
        // panel.setBackground(Color.DARK_GRAY);
        // panel.add(add);
        // panel.add(remove);
        // panel.add(update);

        add(textArea, BorderLayout.CENTER);
        add(state, BorderLayout.SOUTH);

        MyActionListener listener = new MyActionListener();

        state.addActionListener(listener);
        
       

    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if(ev.getActionCommand().equals("Change State")){
                
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setSize(420,120);
                frame.setLayout(new BorderLayout());
                frame.setTitle("Change State");
                frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                JPanel panel = new JPanel(new GridLayout(1,2));
                panel.setBackground(Color.DARK_GRAY);
                
                CustomButton change = new CustomButton("Change");
                CustomLabel label = new CustomLabel("Enter Product Name");
                CustomField field = new CustomField();

                panel.add(label);
                panel.add(field);

                frame.add(panel, BorderLayout.CENTER);
                frame.add(change, BorderLayout.SOUTH);
                
                change.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        if(ev.getActionCommand().equals("Change")){
                            FileOperation<HashMap<Product,Boolean>> file = new FileOperation<>("Project\\DataBase\\ProductCatalog");
                            String name = field.getText();
                            try {
                                HashMap<Product, Boolean> cat = file.pull();
                                for(Product p : cat.keySet()){
                                    if(p.getName().equals(name)){
                                        cat.put(p, !cat.get(p));
                                        file.push(cat);
                                        JOptionPane.showMessageDialog(null, "State Changed");
                                        frame.dispose();
                                        dispose();
                                        new ViewProductCatalog();

                                        break;
                                    }
                                }
                                // frame.dispose();
                                // new frame();
                            } catch (ClassNotFoundException | IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });

            }

        }
    }
}
