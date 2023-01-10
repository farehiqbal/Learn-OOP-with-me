package Project.Inventory;

import java.util.HashMap;

import Project.FileHandling.FileOperation;
import Project.Products.*;
import Project.Utils.Date;

public class Runner {
    public static void main(String[] args) {
        
        FileOperation<HashMap<Product,Integer>> file = new FileOperation<>("Inventory");

        Inventory inventory = new Inventory(10);
        
        // inventory.addIntoInventory(new Apple(1.0, new Date(10, 02, 2023), 100), 50);
        inventory.updateQuantity(new Apple("Apple"), 20);
        inventory.printInventory();
    }
}
