package Project.Inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import Project.Products.*;

public class Inventory implements Serializable {
    
    HashMap<Product,Integer> inventory;
    
    public Inventory(){
        inventory = new HashMap<>();
    }

    public Inventory(Integer preSetQuantity){
        this();
        inventory.put(new Apple("Apple"), preSetQuantity);
        inventory.put(new Banana("Banana"), preSetQuantity);
        inventory.put(new Beef("Beef"), preSetQuantity);
        inventory.put(new Biscuits("Biscuits"), preSetQuantity);
        inventory.put(new Cheese("Cheese"), preSetQuantity);
        inventory.put(new Chicken("Chicken"), preSetQuantity);
        inventory.put(new Chocolates("Chocolates"), preSetQuantity);
        inventory.put(new Eggs("Eggs"), preSetQuantity);
        inventory.put(new Fish("Fish"), preSetQuantity);
        inventory.put(new Mango("Mango"), preSetQuantity);
    }
    

    public void addIntoInventory(Product product, Integer quantity){
        
        inventory.put(product, quantity);
    }

    public void removeFromInventory(Product product, Integer quantity){
        inventory.put(product, inventory.get(product) - quantity);
    }

    public void printInventory(){
        
        inventory.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public ArrayList<Product> getAvailableProducts(){
        ArrayList<Product> list = new ArrayList<>();
        for(Product i : inventory.keySet()){
            if(inventory.get(i) > 0){
                list.add(i);
            }
        }
        return list;
    }

    public Integer updateQuantity(Product product, Integer newQuantitiy){
        return inventory.put(product, newQuantitiy);
    }

    public void printUnavailableProducts(){
        for(Product i : inventory.keySet()){
            if(inventory.get(i) == 0){
                System.out.println(i);
            }
        }
    }


    public HashMap<Product, Integer> getInventory() {
        return inventory;
    }


    public void setInventory(HashMap<Product, Integer> inventory) {
        this.inventory = inventory;
    }

    public void printStockOfProduct(Product product){
        System.out.println(inventory.get(product));
    }

    public static HashMap<Product,Integer> readyMadeInventory(){
        
        HashMap<Product,Integer> log = new HashMap<>();

        log.put(new Apple("Apple"), 10);
        log.put(new Banana("Banana"), 10);
        log.put(new Beef("Beef"), 10);
        log.put(new Biscuits("Biscuits"), 10);
        log.put(new Cheese("Cheese"), 10);
        log.put(new Chicken("Chicken"), 10);
        log.put(new Chocolates("Chocolates"), 10);
        log.put(new Eggs("Eggs"), 10);
        log.put(new Fish("Fish"), 10);
        log.put(new Mango("Mango"), 10);

        return log;
    }


    


}
