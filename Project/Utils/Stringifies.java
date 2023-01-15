package Project.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import Project.Products.*;
import Project.Users.*;
import Project.Store;
import Project.FileHandling.FileOperation;

public class Stringifies {
    

    FileOperation<ArrayList<Manager>> managerFile = new FileOperation<>("Project\\DataBase\\Manager");
    FileOperation<ArrayList<Store>> storeFile = new FileOperation<>("Project\\DataBase\\Store");
    FileOperation<ArrayList<Customer>> customerFile = new FileOperation<>("Project\\DataBase\\Customer");


    public static String getManagers() throws ClassNotFoundException, IOException{
        FileOperation<ArrayList<Manager>> managerFile = new FileOperation<>("Project\\DataBase\\Manager");
        ArrayList<Manager> managers = managerFile.pull();
        String managerString = "CNIC\t|" + "City\t\t|" + "Gender" + "\n";
        managerString += "---------------------------------------------------------------------" + "\n";
        for (Manager manager : managers) {
            managerString += manager.getCnic() + "\t"  + manager.getLocation() + "\t\t" + manager.getGender() + "\n";
        }
        return managerString;
    }

    public static String getCustomers() throws ClassNotFoundException, IOException{
        FileOperation<ArrayList<Customer>> customerFile = new FileOperation<>("Project\\DataBase\\Customer");
        ArrayList<Customer> customers = customerFile.pull();
        String customerString = "CNIC\t\t\t |" + "City\t\t |" + "Gender" + "\n";
        customerString += "--------------------------------------------------------------------" + "\n";
        
        for (Customer customer : customers) {
            customerString += customer.getCnic() + "\t\t"  + customer.getLocation() + "\t\t" + customer.getGender() + "\n";
        }
        
        return customerString;
    }

    public static String getStores() throws ClassNotFoundException, IOException{
        FileOperation<ArrayList<Store>> storeFile = new FileOperation<>("Project\\DataBase\\Store");
        ArrayList<Store> stores = storeFile.pull();

        String storeString = "Location\t\t |" + "  Manager CNIC" + "\n";
        storeString += "---------------------------------------------------------------" + "\n";
        for (Store store : stores) {
            storeString += store.getLocation() + "\t\t" + "  "+ store.getManager().getCnic() + "\n";
        }
        return storeString;
    }


    public static String getProductCatalog() throws ClassNotFoundException, IOException{
        FileOperation<HashMap<Product, Boolean>> catalogFile = new FileOperation<>("Project\\DataBase\\ProductCatalog");
        HashMap<Product,Boolean> cataloge = catalogFile.pull();
        String customerString = "Products\t\t\t" + "State" + "\n";
        customerString += "-------------------------------------------------------------------------------------" + "\n";
        

        for (Product key : cataloge.keySet()) {
            customerString += key + "\t\t\t " + cataloge.get(key) + "\n";
        }
        return customerString;
    }

    public static String getStoreInventory(Store store){

        String storeInventory = " "+"Products\t\t" + "Weight" + "\tPrice" + "\tQuantity"+"\n";
        storeInventory += "-------------------------------------------------------------------------------------" + "\n";
        
        for (Product key : store.getInventory().getAvailableProducts()) {
            storeInventory += " "+ key + "\t\t " + key.getWeight() + "\t" + key.getPrice() + "\t" + store.getInventory().getQuantity(key) + "\n";
        }

        return storeInventory;
    }

    // public static String getStoreOrders(Store store){

    //     String storeOrders = " "+"Products\t\t" + "Weight" + "\tPrice" + "\tQuantity"+"\n";
    //     storeOrders += "-------------------------------------------------------------------------------------" + "\n";
        
    //     for (Product key : store.getAvailableProducts()) {
    //         storeOrders += " "+ key + "\t\t " + key.getWeight() + "\t" + key.getPrice() + "\t" + store.getInventory().get(key) + "\n";
    //     }

    //     return storeOrders;
    // }

    public static String getCart(HashMap<Product, Integer> cart){

        String cartString = " "+"Products\t\t" + "Weight" + "\tPrice" + "\tQuantity"+"\n";
        cartString += "-------------------------------------------------------------------------------------" + "\n";
        
        for (Product key : cart.keySet()) {
            cartString += " "+ key + "\t\t " + key.getWeight() + "\t" + key.getPrice() + "\t" + cart.get(key) + "\n";
        }

        return cartString;
    }
}
