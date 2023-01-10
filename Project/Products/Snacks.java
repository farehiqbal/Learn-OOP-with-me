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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
