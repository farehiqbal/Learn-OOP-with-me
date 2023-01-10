package Project.Products;

public class Shampoo extends PersonalHygiene{
    
    public Shampoo(){
        this.name = "Shampoo";
    }


    public Shampoo(String name){
        this.name = name;
    }

    Shampoo(double _price, String description){
        this.price = _price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shampoo";
    }
    
    public String getDescription(){
        return "Shampoo makes hair smoother";
    }
}
