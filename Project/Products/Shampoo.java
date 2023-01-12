package Project.Products;

public class Shampoo extends PersonalHygiene{
    
    public Shampoo(){
        this.name = "Shampoo";
    }


    public Shampoo(String name){
        this.name = name;
    }

    public Shampoo(double _price, String description){
        this.price = _price;
        this.description = description;
    }

    public Shampoo(double _weight, double _price){
        super();
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
