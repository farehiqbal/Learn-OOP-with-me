package Project.Products;

import Project.Utils.Date;

public class Apple extends Fruit{
    
    public Apple(){
        this.name = "Apple";
    }
    public Apple(String name){
        this.name = name;
    }
    public Apple(double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
    }

    public String getDescription(){
        return "Apples are red";
    }

    @Override
    public String toString() {
        return "Apples";
    }

}
