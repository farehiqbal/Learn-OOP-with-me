package Project.Products;

import Project.Utils.Date;

public class Fish extends Meat{
    
    public Fish(){
        this.name = "Fish";
    }

    public Fish(String name){
        this.name = name;
    }

    public Fish(String name,double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name= name;
    }

    public Fish(String name, double _weight, double _price){
        super(_weight,_price);
        this.name = name;
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
