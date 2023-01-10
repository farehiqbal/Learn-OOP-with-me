package Project.Products;

import Project.Utils.Date;

public class Milk extends Dairy{
    
    public Milk(){
        this.name = "Milk";
    }
    
    public Milk(String name){
        this.name = name;
    }

    public Milk(double _weight, Date date, double _price, String description){
        
        super(_weight, date);
        this.price = _price;
        this.description = description;
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
