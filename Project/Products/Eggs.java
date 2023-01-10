package Project.Products;

import Project.Utils.Date;

public class Eggs extends Dairy{


    public Eggs(){
        this.name = "Eggs";
    }

    public Eggs(String name){
        this.name = name;
    }

    public Eggs(double _weight, Date date, double _price, String description){
        super(_weight, date);
        this.price = _price;
        this.description = description;
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
