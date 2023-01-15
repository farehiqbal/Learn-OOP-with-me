package Project.Products;

public class Wheat extends Grains{
    
    public Wheat(){
        this.name = "Wheat";
    }


    public Wheat(String name){
        this.name = name;
    }

    public Wheat(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    public String getDescription(){
        return "Wheat makes survivalpossible";
    }

    @Override
    public String toString() {
        return "Wheat";
    }
}
