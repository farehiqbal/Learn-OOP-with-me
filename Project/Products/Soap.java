package Project.Products;

public class Soap extends PersonalHygiene{
    
    public Soap() {
        this.name = "Soap";
    }

    public Soap(String name){
        this.name = name;
    }

    public Soap(String name, double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
        this.name = name;
    }
    
    public Soap(double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
    }

    @Override
    public String toString() {
        return "Soap";
    }
    
    public String getDescription(){
        return "Soap makes hygine possible";
    }
}
