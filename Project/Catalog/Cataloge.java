package Project.Catalog;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import Project.FileHandling.FileOperation;
import Project.Products.*;


public class Cataloge implements Serializable{
    
    FileOperation<HashMap<Product,Boolean>> file = new FileOperation<>("Project\\DataBase\\ProductCatalog");
    HashMap<Product,Boolean> cataloge;
    
    Cataloge(){
        cataloge = new HashMap<>();
    }

    public void addIntoCatalogue(Product product, Boolean bool){
        cataloge.put(product, bool);
    }


    private Product findFromCataloge(Product _product) throws ClassNotFoundException, IOException{
        
        HashMap<Product,Boolean> oldCataloge = file.pull();
        for(Product i : oldCataloge.keySet()){
            if(i.getName().equals(_product.getName())){
                return i;
            }
        }
        
        return null;
    }

    public void removeFromCatalog(Product _product) throws ClassNotFoundException, IOException{

        HashMap<Product,Boolean> OldCataloge = file.pull();
        Product product = findFromCataloge(_product);

        if(product != null){
            OldCataloge.put(product, false);
            file.push(OldCataloge);
        }

        
    }

    public void printCatalog(HashMap<Product,Boolean> cataloge){
        
        cataloge.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    public void printAvailableProducts(){

        for(Product i : cataloge.keySet()){
            if(cataloge.get(i)){
                System.out.println(i);
            }
        }
    }

    public void printUnavailableProducts(){

        for(Product i : cataloge.keySet()){
            if(!cataloge.get(i)){
                System.out.println(i);
            }
        }
    }

    public boolean isAvailable(Product product) throws ClassNotFoundException, IOException{
        HashMap<Product,Boolean> oldCataloge = file.pull();
        for(Product i : oldCataloge.keySet()){
            if(i.getName().equals(product.getName())){
                return true;
            }
        }

        return false;
    }

    public HashMap<Product,Boolean> getCataloge(){
        return cataloge;
    }

    public void setCataloge(HashMap<Product,Boolean> cataloge){
        this.cataloge = cataloge;
    }

    public String printMap() {

        String keyValuePairs = "";
        for (Product key : cataloge.keySet()) {
            keyValuePairs += key + ": " + cataloge.get(key) + "\n";
        }
        return keyValuePairs;
    }

    public static HashMap<Product,Boolean> readyMadeCatalog(){

        HashMap<Product,Boolean> log = new HashMap<>();

        log.put(new Apple("Apple",1.0,200.0),true);
        log.put(new Banana("Banana",12.0,120.0),true);
        log.put(new Beef("Beef",1.0,600.0),true);
        log.put(new Biscuits("Biscuits",24.0,240.0),true);
        log.put(new Cheese("Biscuits",1.0,1200.00),true);
        log.put(new Chicken("Chicken",1.0,400.0),true);
        log.put(new Chocolates("Chocolates",1.0,250.0),true);
        log.put(new Eggs("Eggs",12.0,360.0),true);
        log.put(new Fish("Fish",1.0,500.0),true);
        log.put(new Mango("Mango",1.0,200.0),true);
        log.put(new Milk("Milk",1.0,180.0),true);
        log.put(new Mutton("Mutton",1.0,1400.0),true);
        log.put(new Rice("Rice",1.0,220.0),true);
        log.put(new Shampoo("Shampoo",1.0,450.0),true);
        log.put(new Soap("Soap",1.0,110.0),true);
        log.put(new Wheat("Wheat",1.0,960.0),true);
        log.put(new Yogurt("Yogurt",1.0,210.0),true);
        
        return log;
    }


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        FileOperation<HashMap<Product,Boolean>> file = new FileOperation<HashMap<Product,Boolean>>("Project\\DataBase\\ProductCatalog");

        // HashMap<Product,Boolean> hashMap = file.pull();
        // hashMap.entrySet().forEach(entry -> {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // });

        // try {
        //     file.push(readyMadeCatalog());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        // // Cataloge cataloge = new Cataloge();
        // // Product apple = new Apple();
        // // cataloge.removeFromCatalog(apple);
       
    }
}
