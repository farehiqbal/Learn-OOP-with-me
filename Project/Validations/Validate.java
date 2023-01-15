package Project.Validations;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.*;

import Project.Store;
import Project.FileHandling.FileOperation;
import Project.Products.Product;

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

    public static Store checkForStore(String cnic, String location) throws ClassNotFoundException, IOException{


        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");

        ArrayList<Store> arrayList = file.pull();
        System.out.println(arrayList.toString());
        for (Store store : arrayList) {
            if(cnic.equals(store.getManager().getCnic()) && location.equals(store.getLocation())){
                // JOptionPane.showMessageDialog(null, "Store already exists");
                return store;
            }
        }

        return null;
        

    }

    public static String findFromStore(String string) throws ClassNotFoundException, IOException {  
        
        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");

        ArrayList<Store> list = file.pull();
        Store maxStore = list.get(0);
        // Fish fish = new Fish("Fish");
        for(int i = 1; i < list.size(); i++){
            // if(list.get(i).getInventory().entrySet() > maxStore.getInventory().getName("Fish")){
            //     maxStore = list.get(i);
            // }
            ArrayList<Product> products = list.get(i).getAvailableProducts();
            
            Product xproduct = null;
            for (Product product : products) {
                if(product.getName().equals(string)){
                   xproduct = product;
                }
            }

            if(xproduct != null){
                if(list.get(i).getInventory().getQuantity(xproduct) > maxStore.getInventory().getQuantity(xproduct)){
                    maxStore = list.get(i);
                }
            }
        }

        return maxStore.getLocation();
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        System.out.println(Validate.findFromStore("Fish"));
    }
}
