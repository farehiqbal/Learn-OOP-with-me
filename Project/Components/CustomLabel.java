package Project.Components;

import javax.swing.*;
import java.awt.Color;

public class CustomLabel extends JLabel{
    
    public CustomLabel(){
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
    }

    public CustomLabel(String text){
        this();
        setText(text);
    }

}
