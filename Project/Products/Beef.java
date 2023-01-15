package Project.Products;

import Project.Utils.Date;

public class Beef extends Meat{

    public Beef(){
        this.name = "Beef";
    }
    
    public Beef(String name){
        this.name = name;
    }
    
    public Beef(String name, double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Beef(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    public String getDescription(){
        return "Beef Meat!";
    }

    @Override
    public String toString() {
        return "Beef";
    }


}
