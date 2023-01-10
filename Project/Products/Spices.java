package Project.Products;

public class Spices extends Food{
    
    protected double weight;
    
    public Spices() {
        type = GoodsType.NONPERISHABLE;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
