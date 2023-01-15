package Project.Products;

public class Shampoo extends PersonalHygiene{
    
    public Shampoo(){
        this.name = "Shampoo";
    }


    public Shampoo(String name){
        this.name = name;
    }

    public Shampoo(String name, double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
        this.name = name;
    }

    public Shampoo(double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
    }

    @Override
    public String toString() {
        return "Shampoo";
    }
    
    public String getDescription(){
        return "Shampoo makes hair smoother";
    }
}
