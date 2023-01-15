package Project.Inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import Project.Products.*;

public class Inventory implements Serializable{
    
    HashMap<Product,Integer> inventory;
    
    public Inventory(){
        inventory = new HashMap<>();
    }

    public Inventory(Integer preSetQuantity){
        this();
        inventory.put(new Apple("Apple",1.0,200.0),preSetQuantity);
        inventory.put(new Banana("Banana",12.0,120.0),preSetQuantity);
        inventory.put(new Beef("Beef",1.0,600.0),preSetQuantity);
        inventory.put(new Biscuits("Biscuits",24.0,240.0),preSetQuantity);
        inventory.put(new Cheese("Biscuits",1.0,1200.00),preSetQuantity);
        inventory.put(new Chicken("Chicken",1.0,400.0),preSetQuantity);
        inventory.put(new Chocolates("Chocolates",1.0,250.0),preSetQuantity);
        inventory.put(new Eggs("Eggs",12.0,360.0),preSetQuantity);
        inventory.put(new Fish("Fish",1.0,500.0),preSetQuantity);
        inventory.put(new Mango("Mango",1.0,200.0),preSetQuantity);
        inventory.put(new Milk("Milk",1.0,180.0),preSetQuantity);
        inventory.put(new Mutton("Mutton",1.0,1400.0),preSetQuantity);
        inventory.put(new Rice("Rice",1.0,220.0),preSetQuantity);
        inventory.put(new Shampoo("Shampoo",1.0,450.0),preSetQuantity);
        inventory.put(new Soap("Soap",1.0,110.0),preSetQuantity);
        inventory.put(new Wheat("Wheat",1.0,960.0),preSetQuantity);
        inventory.put(new Yogurt("Yogurt",1.0,210.0),preSetQuantity);

    }
    public Integer getQuantity(Product product){
        return inventory.get(product);
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

    public String printMap() {

        String keyValuePairs = "";
        for (Product key : inventory.keySet()) {
            keyValuePairs += key + ": " + inventory.get(key) + "\n";
        }
        return keyValuePairs;
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
        log.put(new Milk("Milk"), 10);
        log.put(new Mutton("Mutton"), 10);
        log.put(new Rice("Rice"), 10);
        log.put(new Shampoo("Shampoo"), 10);
        log.put(new Soap("Soap"), 10);
        log.put(new Wheat("Wheat"), 10);
        log.put(new Yogurt("Yogurt"), 10);

        return log;
    }



    


}
