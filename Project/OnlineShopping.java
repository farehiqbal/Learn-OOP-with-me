package Project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import Project.Products.*;
import Project.Catalog.Cataloge;
import Project.FileHandling.FileOperation;
import Project.Users.Customer;

public class OnlineShopping {
    FileOperation<HashMap<Product,Boolean>> Catalogfile = new FileOperation<>("Project\\DataBase\\ProductCatalog");
    HashMap<Product,Integer> cart;
    Customer customer;
   
    public OnlineShopping(Customer customer) throws ClassNotFoundException, IOException{
        this.customer = customer;
        cart = new HashMap<>();
    }

    public void displayItems() throws ClassNotFoundException, IOException{
        
        HashMap<Product,Boolean> cataloge = Catalogfile.pull();

        cataloge.forEach((k,v)->{
            System.out.println(k);
        });
    }
    

    public void addToCart(Product product, Integer quantity){
        cart.put(product, quantity);
    }


    public void removeFromCart(Product product){
        cart.remove(product);
    }

    public void displayCart(){
        cart.forEach((k,v)->{
            System.out.println(k + " " + v);
        });
    }

    public Store getNearestStore() throws ClassNotFoundException, IOException{
        
        String custlocation = customer.getLocation();
        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
        ArrayList<Store> stores = file.pull();
        

        Store nearestStore = null;
        for (Store store : stores) {
            if (store.getLocation().equals(custlocation)) {
                nearestStore = store;
                break;
            }

        }

        if (nearestStore == null) {
            System.out.println("No Store in your city");
            return null;
        }

        return nearestStore;
    }

    public void checkout() throws ClassNotFoundException, IOException{
        
        FileOperation<ArrayList<Store>> file = new FileOperation<>("Project\\DataBase\\Store");
        // ArrayList<Store> stores = file.pullIterable();
        
        Store nearestStore = getNearestStore();
        Store oldcopy = nearestStore;

        if (nearestStore == null) {
            return;
        }

        for (Product product : cart.keySet()) {
            nearestStore.removeFromInventory(product, cart.get(product));
            
        }
        
        ArrayList<Store> temp = file.pull();
        // System.out.println(temp.remove(oldcopy));
        System.out.println(temp.add(nearestStore));

        file.push(temp);

    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        OnlineShopping customer = new OnlineShopping(new Customer("Islamabad"));

        // customer.displayItems();
        customer.addToCart(new Banana(), 2);
        customer.displayCart();
        customer.checkout();

    }
}
