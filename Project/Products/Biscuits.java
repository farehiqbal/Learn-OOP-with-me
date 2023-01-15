package Project.Products;

public class Biscuits extends Snacks{
    
    public Biscuits(){
        this.name = "Biscuits";
    }

    public Biscuits(String name){
        this.name = name;
    }
    public Biscuits(String name, double _weight, double _price){
        super(_weight);
        this.price = _price;
        this.name = name;
    }

    public String getDescription(){
        return "Biscuits are hunger killer";
    }

    @Override
    public String toString() {
        return "Biscuits";
    }
}
