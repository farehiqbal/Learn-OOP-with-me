package Project.Products;

import Project.Utils.Date;

public class Banana extends Fruit{

    public Banana(){
        this.name = "Banana";
    }
    
    public Banana(String name){
        this.name = name;
    }

    public Banana(String name, double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Banana(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    public String getDescription(){
        return "Banana are sold in dozens";
    }

    @Override
    public String toString() {
        return "Banana";
    }

}
