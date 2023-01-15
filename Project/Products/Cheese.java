package Project.Products;

import Project.Utils.Date;

public class Cheese extends Dairy{
    
    public Cheese(){
        this.name = "Cheese";
    }

    public Cheese(String name){
        this.name = name;
    }

    public Cheese(String name,double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Cheese(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
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
