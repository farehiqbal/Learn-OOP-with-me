package Project.FileHandling;

import java.io.IOException;
import java.util.HashMap;

import Project.Catalog.Cataloge;
import Project.Products.*;

public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        FileOperation<HashMap<Product,Boolean>> file = new FileOperation<>("Project\\DataBase\\ProductCatalog");

        file.pull().entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        
        // HashMap<Product,Boolean> cataloge = Cataloge.readyMadeCatalog();
        // file.push(cataloge);
     }
}
