package Project.Products;

public class Rice extends Grains{
    
    public Rice(){
        this.name = "Rice";
    }


    public Rice(String name){
        this.name = name;
    }

    public Rice(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    public String getDescription(){
        return "Rice are hunger killer";
    }

    @Override
    public String toString() {
        return "Rice";
    }
}
