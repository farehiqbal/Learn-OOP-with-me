package Project.Products;

import Project.Utils.Date;

public class Milk extends Dairy{
    
    public Milk(){
        this.name = "Milk";
    }
    
    public Milk(String name){
        this.name = name;
    }

    public Milk(String name,double _weight, Date date, double _price){
        
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Milk(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Milk";
    }

    @Override
    public String getDescription(){
        return "Milk!";
    }

}
