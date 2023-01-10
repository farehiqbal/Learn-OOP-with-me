package Project.Products;

import Project.Utils.Date;

public class Fish extends Meat{
    
    public Fish(){
        this.name = "Fish";
    }

    public Fish(String name){
        this.name = name;
    }

    public Fish(double _weight, Date date, double _price, String description){
       super(_weight, date);
        this.price = _price;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Fish";
    }

    @Override
    public String getDescription(){
        return "Fish full of proteins!";
    }
}
