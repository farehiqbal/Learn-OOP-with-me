package Project.Products;

public class Grains extends Food{
    
    private double weight;
    
    public Grains() {
        type = GoodsType.NONPERISHABLE;
    }

    public Grains(double weight){
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
