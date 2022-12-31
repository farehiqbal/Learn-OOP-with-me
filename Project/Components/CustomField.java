package Project.Components;

import java.awt.Color;

import javax.swing.*;

public class CustomField extends JTextField{
   
    public CustomField(){
        setBackground(Color.WHITE);
    }

    public CustomField(int cols){
        this();
        setColumns(cols);
    }

}
