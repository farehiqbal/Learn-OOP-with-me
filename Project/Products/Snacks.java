package Project.Products;

public class Snacks extends Food{
    private double weight;
    
    public Snacks() {
        type = GoodsType.NONPERISHABLE;
    }

    public Snacks(double weight){
        this();
        this.weight = weight;
    }

    public Snacks(double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
