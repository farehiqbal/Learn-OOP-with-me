package Project.Products;

public class Chocolates extends Snacks{
    
    public Chocolates(){
        this.name = "Chocolates";
    }

    public Chocolates(String name){
        this.name = name;
    }
    public Chocolates(double _weight, double _price){
        super(_weight, _price);
    }

    public String getDescription(){
        return "Chocolates are like fine wine!";
    }

    @Override
    public String toString() {
        return "Chocolates";
    }
}
