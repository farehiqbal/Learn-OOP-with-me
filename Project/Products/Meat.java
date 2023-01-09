package Project.Products;

public class Meat extends Food {
     
    protected double weight;
    protected Date expiryDate;

    public Meat() {
        type = GoodsType.PERISHABLE;
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
