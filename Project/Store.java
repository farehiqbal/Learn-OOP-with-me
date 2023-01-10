package Project;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


import Project.FileHandling.FileOperation;
import Project.Inventory.Inventory;
import Project.Products.*;
import Project.Users.Manager;

public class Store {
    
    FileOperation<HashMap<Product,Boolean>> file = new FileOperation<>("Project\\DataBase\\ProductCatalog");
    
    Inventory inventory;
    Manager manager;

    public Store(Manager manager){
        
        this.manager = manager;
        inventory = new Inventory(10);
    }

    void printStoreInventory() throws ClassNotFoundException, IOException{

        HashMap<Product,Boolean> cataloge = file.pull();
        
        for (Product i : inventory.getAvailableProducts()) {
            if(cataloge.get(i))
            System.out.println(i);
            else{
                System.out.println("The product removed from catalog by admin: "+i);
            }
        }
    }

   public static void main(String[] args) {

        Store store1 = new Store(new Manager());
        try {
            store1.printStoreInventory();
        } catch (ClassNotFoundException | IOException e) {
            
            e.printStackTrace();
        }
    }
}
