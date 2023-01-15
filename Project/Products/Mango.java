package Project.Products;

import Project.Utils.Date;

public class Mango extends Fruit{
    
    public Mango(){
        this.name = "Mango";
    }
    
    public Mango(String name){
        this.name = name;
    }

    public Mango(String name, double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Mango(String name, double _weight, double _price){
        super(_weight,_price);
        this.name = name;

    }

    public String getDescription(){
        return "Mangoes are love!";
    }

    @Override
    public String toString() {
        return "Mango";
    }

}
