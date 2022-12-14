package Project.Products;

import Project.Utils.Date;

public class Beef extends Meat{

    public Beef(){
        this.name = "Beef";
    }
    
    public Beef(String name){
        this.name = name;
    }
    
    public Beef(double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
    }

    public String getDescription(){
        return "Beef Meat!";
    }

    @Override
    public String toString() {
        return "Beef";
    }


}
