package Project.Panels;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import Project.Store;
import Project.FileHandling.FileOperation;
import Project.Products.Apple;
import Project.Products.Product;
import Project.Users.Manager;
import Project.Utils.Stringifies;
import Project.Validations.Validate;



public class Runner {
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        LoginPanel panel = new LoginPanel();

        // FileOperation<HashMap<Product,Integer>> file = new FileOperation<>("Project\\DataBase\\Store");
        // ArrayList<Store> list = new ArrayList<>();
            

        // System.out.println(Stringifies.getProductCatalog());
        // ViewProductCatalog catalog = new ViewProductCatalog();

        // Apple apple = new Apple("Apple");
        // System.out.println(apple.getName());



        // String name = .getText();
        // try {
        //     HashMap<Product, Boolean> cat = file.pull();
        //     for(Product p : cat.keySet()){
        //         if(p.getName().equals(name)){
        //             cat.put(p, !cat.get(p));
        //             file.push(cat);
        //             frame.dispose();
        //             break;
        //             System.out.println(p.getName());
        //         }
        //         cat.get(p);
        //         // System.out.println(p.getName());
        //     }
        // } catch (ClassNotFoundException | IOException e) {
        //     e.printStackTrace();
        // }

        // FileOperation<ArrayList<Manager>> file = new FileOperation<>("Project\\DataBase\\Manager");
        
        // ArrayList<Manager> managers = new ArrayList<>();

        // managers.add(new Manager("1234567890098", "password", "Pindi", "Male", "Saddar", 957937953));

        // file.push(managers);

        // Manager manager = new Manager("1234567890098", "password", "Pindi", "Male", "Saddar", 957937953);

        // System.out.println(manager.getCnic());
  
        // FileOperation<ArrayList<Store>> stores = new FileOperation<>("Project\\DataBase\\Store");

        // ArrayList<Store> list = new ArrayList<>();
        

        // Manager manager = new Manager("0987654321123","password","Islamabad","Male","Asd",4567l);

        // Store store = new Store(manager, "Islamabad");

        // list.add(store);

        // stores.push(list);

        // for (Store store : list) {
        //     System.out.println(store.getManager().getCnic());
        //     System.out.println(store.getLocation());
        // }
        
        // list.remove(3);
        // stores.push(list);
        // Store store = Validate.checkForStore("3310226831082", "Faisalabad");
        // System.out.println(store.getLocation());
        // System.out.println(store.getManager().getCnic());
    }
}
 