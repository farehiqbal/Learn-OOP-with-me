package Project.Products;

import Project.Utils.Date;

public class Yogurt extends Dairy{
    
    public Yogurt(){
        this.name = "Yogurt";
    }

    public Yogurt(String name){
        this.name = name;
    }

    public Yogurt(double _weight, Date date, double _price, String description){
        
        super(_weight, date);
        this.price = _price;
        this.description = description;
    }

    public Yogurt(double _weight, double _price){
        super(_weight,_price);
    }

    @Override
    public String toString() {
        return "Yogurt";
    }

    @Override
    public String getDescription(){
        return "Yogurt";
    }
}
