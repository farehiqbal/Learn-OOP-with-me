package Project.Products;

import Project.Utils.Date;

public class Chicken extends Meat{
    
    public Chicken(){
        this.name = "Chicken";
    }


    public Chicken(String name){
        this.name = name;
    }

    public Chicken(String name, double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;

    }

    public Chicken(String name,double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }

    public String getDescription(){
        return "Chicken breast";
    }

    @Override
    public String toString() {
        return "Chicken";
    }


    

}
