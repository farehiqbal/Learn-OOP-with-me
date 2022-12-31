package Project.Validations;

import javax.swing.*;

public class Validate {
    
    public static boolean verifyCNIC(String cnic){

        if(cnic.length() != 13){
            JOptionPane.showMessageDialog(null, "Enter valid 13 digits cnic");
            return false; 
        }

        return true;
    }

    public static boolean passwordsMatch(String pass, String confirmPass){

        if(!pass.equals(confirmPass)){
            JOptionPane.showMessageDialog(null, "Passwords do not match");
            return false;
        }

        return true;
    }
}
