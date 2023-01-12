package Project.Products;

public class Soap extends PersonalHygiene{
    
    public Soap() {
        this.name = "Soap";
    }

    public Soap(String name){
        this.name = name;
    }

    Soap(double _price, String description){
        this.price = _price;
        this.description = description;
    }
    

    @Override
    public String toString() {
        return "Soap";
    }
    
    public String getDescription(){
        return "Soap makes hygine possible";
    }
}
