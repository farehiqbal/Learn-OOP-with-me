package Project.Products;

public class Wheat extends Grains{
    
    public Wheat(){
        this.name = "Wheat";
    }


    public Wheat(String name){
        this.name = name;
    }

    public Wheat(double _weight, double _price){
        super(_weight,_price);
    }

    public String getDescription(){
        return "Wheat makes survivalpossible";
    }

    @Override
    public String toString() {
        return "Wheat";
    }
}
