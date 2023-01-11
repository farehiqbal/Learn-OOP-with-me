package Project;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import Project.FileHandling.FileOperation;
import Project.Inventory.Inventory;
import Project.Products.*;
import Project.Users.Manager;

public class Store implements Serializable{
    
    FileOperation<HashMap<Product,Boolean>> file = new FileOperation<>("Project\\DataBase\\ProductCatalog");
    
    String location;
    Inventory inventory;
    Manager manager;

    public Store() {

    }

    public Store(Manager manager, String location){
        
        this.manager = manager;
        inventory = new Inventory(10);
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }
    public Manager getManager(){
        return this.manager;
    }

    public void printStoreInventory() throws ClassNotFoundException, IOException{

        HashMap<Product,Boolean> cataloge = file.pull();
        
        for (Product i : inventory.getAvailableProducts()) {
            if(cataloge.get(i))
                System.out.println(i);
            else{
                System.out.println("The product removed from catalog by admin: "+i);
            }
        }
    }

    public void displayStoreInventory(){
        inventory.printInventory();
    }

    public void removeFromInventory(Product product, Integer quantity) throws ClassNotFoundException, IOException{
        HashMap<Product,Boolean> cataloge = file.pull();
        if(cataloge.get(product)){
            inventory.removeFromInventory(product, quantity);
        }
        else{
            System.out.println("The product is currently unavailable");
        }
        
    }

    public void addIntoInventory(Product product, Integer quantity) throws ClassNotFoundException, IOException{
        HashMap<Product,Boolean> cataloge = file.pull();
        if(cataloge.get(product)){
            inventory.addIntoInventory(product, quantity);
        }
        else{
            System.out.println("The product is currently unavailable");
        }
    }

    public void updateQuantity(Product product, Integer newQuantity) throws ClassNotFoundException, IOException{
        HashMap<Product,Boolean> cataloge = file.pull();
        if(cataloge.get(product)){
            inventory.updateQuantity(product, newQuantity);
        }
        else{
            System.out.println("The product is currently unavailable");
        }
    }


    public ArrayList<Product> getAvailableProducts() throws ClassNotFoundException, IOException{
        
        HashMap<Product,Boolean> cataloge = file.pull();
        
        ArrayList<Product> list = inventory.getAvailableProducts();
        ArrayList<Product> availableList = new ArrayList<>();
        for (Product i : list) {
            if(cataloge.get(i)){
                availableList.add(i);
            }
        }
        return availableList;

    }

    public static void addNewStore(Store store) throws ClassNotFoundException, IOException{

        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
        
        ArrayList<Store> stores= file.pull();

        stores.add(store);

        file.push(stores);
    }
    
    public static void displayAllStores() throws ClassNotFoundException, IOException{

        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
        
        ArrayList<Store> stores= file.pull();

        for (Store store : stores) {
            System.out.println(store.getLocation());
        }
    }

    @Override
    public String toString() {
        return "Store [file=" + file + ", location=" + location + ", inventory=" + inventory + ", manager=" + manager
                + "]";
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        

        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
        
        Manager manager = new Manager("Islamabad");
        Store store1 = new Store(manager, "Islamabad");
        Store store2 = new Store(new Manager("Faisalabad"), "Faisalabad");
        
        // store1.printStoreInventory();
        
        // FileOperations.writeToFile(store1, "Project\\DataBase\\Store.ser");
        // FileOperations.readFromFile("Project\\DataBase\\Store.ser");
    
        // System.out.println(file.pull().getLocation());
        // file.push(store1);

        // ArrayList<Store> list = new ArrayList<>();

        // list.add(store1);
        // list.add(store2);
        // file.push(list);

        // ArrayList<Store> out = file.pull();
        // for (Store store : out) {
        //     System.out.println(store.getManager().getLocation());
        // }

        // Store.addNewStore(new Store(new Manager("Rawalpindi"), "Rawalpindi"));
        // Store.addNewStore(new Store(new Manager("Lahore"), "Lahore"));
        // Store.addNewStore(new Store(new Manager("Karachi"), "Karachi"));

        Store.displayAllStores();
    } 
}
