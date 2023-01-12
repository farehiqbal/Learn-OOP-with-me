package Project.Products;

import Project.Utils.Date;

public class Mango extends Fruit{
    
    public Mango(){
        this.name = "Mango";
    }
    
    public Mango(String name){
        this.name = name;
    }

    public Mango(double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
    }

    public Mango(double _weight, double _price){
        super(_weight,_price);
    }

    public String getDescription(){
        return "Mangoes are love!";
    }

    @Override
    public String toString() {
        return "Mango";
    }

}
