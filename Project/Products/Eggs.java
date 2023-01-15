package Project.Products;

import Project.Utils.Date;

public class Eggs extends Dairy{


    public Eggs(){
        this.name = "Eggs";
    }

    public Eggs(String name){
        this.name = name;
    }

    public Eggs(String name,double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
        this.name = name;
    }

    public Eggs(String name, double _weight, double _price){
        super(_weight,_price);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Eggs";
    }

    @Override
    public String getDescription(){
        return "Eggs";
    }
}
