package Project.Products;

import Project.Utils.Date;

public class Cheese extends Dairy{
    
    public Cheese(){
        this.name = "Cheese";
    }

    public Cheese(String name){
        this.name = name;
    }

    public Cheese(double _weight, Date date, double _price, String description){
        super(_weight, date);
        this.price = _price;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Cheese";
    }

    @Override
    public String getDescription(){
        return "Cheese";
    }
}
