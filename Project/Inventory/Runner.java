package Project.Inventory;

import java.io.IOException;
import java.util.HashMap;

import Project.FileHandling.FileOperation;
import Project.Products.*;
import Project.Utils.Date;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // FileOperation<Inventory> file = new FileOperation<>("Project\\DataBase\\Inventory");

        Inventory inventory = new Inventory(10);
        
        // inventory.addIntoInventory(new Apple(1.0, new Date(10, 02, 2023), 100), 50);
        // inventory.updateQuantity(new Apple("Apple"), 20);
        // inventory.printInventory();

        String displayInventory = inventory.printMap();

        System.out.println(displayInventory);

        // file.push(inventory);
        // file.pull().printInventory();
    }
}
