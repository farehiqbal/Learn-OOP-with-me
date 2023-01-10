package Project.Products;

import Project.Utils.Date;

public class Mutton extends Meat{
    
    public Mutton(){
        this.name = "Mutton";
    }

    public Mutton(String name){
        this.name = name;
    }

    public Mutton(double _weight, Date date, double _price){
        super(_weight, date);
        this.price = _price;
    }

    public String getDescription(){
        return "Mutton pieces!";
    }

    @Override
    public String toString() {
        return "Mutton";
    }

    


}
