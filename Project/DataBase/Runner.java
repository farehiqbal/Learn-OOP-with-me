package Project.DataBase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.catalog.Catalog;

import Project.Catalog.Cataloge;
import Project.FileHandling.FileOperation;
import Project.Products.Product;
import Project.Users.Manager;
import Project.Store;

public class Runner {
    

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOperation<ArrayList<Manager>> managerFile = new FileOperation<>("Project\\DataBase\\Manager");
        
        

        // managerFile.push(managers);

        // FileOperation<HashMap<Product,Boolean> > catalogFile = new FileOperation<>("Project\\DataBase\\ProductCatalog");
        
        // HashMap<Product,Boolean> catalog = Cataloge.readyMadeCatalog();

        // catalogFile.push(catalog);

        // FileOperation<ArrayList<Store>> storeFile = new FileOperation<>("Project\\DataBase\\Store");

        // ArrayList<Store> stores = new ArrayList<>();

        ArrayList<Manager> managers = new ArrayList<>();
        

        Manager manager1 = new Manager("33100", "password", "Islamabad", " ", " " , 0000);
        // stores.add(new Store(manager1, "Islamabad"));
        
        Manager manager2 = new Manager("33101", "password", "Lahore", " ", " " , 0000);
        // stores.add(new Store(manager2, "Lahore"));

        Manager manager3 = new Manager("33102", "password", "Karachi", " ", " " , 0000);
        // stores.add(new Store(manager3, "Karachi"));

        Manager manager4 = new Manager("33103", "password", "Peshawar", " ", " " , 0000);
        // stores.add(new Store(manager4, "Peshawar"));
        // // for(Store s : stores){
        //     System.out.println(s.toString());
        // }
        // storeFile.push(stores);

        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);
        managers.add(manager4);

        managerFile.push(managers);
    }
}


