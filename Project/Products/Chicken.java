package Project.Products;

public class Chicken extends Meat{
    

    public Chicken(double _weight, Date date, double _price){
        this.weight = _weight;
        this.expiryDate = date;
        this.price = _price;
    }

    public String getDescription(){
        return "Chicken breast";
    }

    @Override
    public String toString() {
        return "Chicken []";
    }


    

}
