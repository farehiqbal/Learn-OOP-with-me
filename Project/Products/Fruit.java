package Project.Products;

import Project.Utils.Date;

public class Fruit extends Food{
    
    private double weight;
    protected Date expiryDate;

    
    public Fruit() {
        type = GoodsType.PERISHABLE;
    }

    public Fruit(double weight, Date expire){
        this();
        this.weight= weight;
        this.expiryDate = expire;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
