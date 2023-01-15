package Project.Products;

import Project.Utils.Date;

public class Yogurt extends Dairy{
    
    public Yogurt(){
        this.name = "Yogurt";
    }

    public Yogurt(String name){
        this.name = name;
    }

    public Yogurt(String name,double _weight, Date date, double _price){
        
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Yogurt(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
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
