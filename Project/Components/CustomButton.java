package Project.Components;

import java.awt.Color;

import javax.swing.*;

public class CustomButton extends JButton{
    
    public CustomButton(){
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        
        setFocusable(false);
    }


    public CustomButton(String text){
        this();
        setText(text);
    }

}
