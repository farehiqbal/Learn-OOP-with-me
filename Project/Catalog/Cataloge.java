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

        log.put(new Apple("Apple"), true);
        log.put(new Banana("Banana"), true);
        log.put(new Beef("Beef"), true);
        log.put(new Biscuits("Biscuits"), true);
        log.put(new Cheese("Cheese"), true);
        log.put(new Chicken("Chicken"), true);
        log.put(new Chocolates("Chocolates"), true);
        log.put(new Eggs("Eggs"), true);
        log.put(new Fish("Fish"), true);
        log.put(new Mango("Mango"), true);
        log.put(new Milk("Milk"), true);
        log.put(new Mutton("Mutton"), true);
        log.put(new Rice("Rice"), true);
        log.put(new Shampoo("Shampoo"), true);
        log.put(new Soap("Soap"), true);
        log.put(new Wheat("Wheat"), true);
        log.put(new Yogurt("Yogurt"), true);
        
        return log;
    }


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        FileOperation<HashMap<Product,Boolean>> file = new FileOperation<HashMap<Product,Boolean>>("Project\\DataBase\\ProductCatalog");

        try {
            file.push(readyMadeCatalog());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Cataloge cataloge = new Cataloge();
        Product apple = new Apple();
        cataloge.removeFromCatalog(apple);
       
    }
}
