package Project.Products;

import Project.Utils.Date;

public class Meat extends Food {
     
    private double weight;
    private Date expiryDate;

    public Meat() {
        type = GoodsType.PERISHABLE;
    }

    public Meat(double weight, Date expire){
        this();
        this.weight = weight;
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
