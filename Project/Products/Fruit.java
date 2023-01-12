package Project.Products;

import Project.Utils.Date;

public class Fruit extends Food{
    
    protected Date expiryDate;

    
    public Fruit() {
        type = GoodsType.PERISHABLE;
    }

    public Fruit(double weight, Date expire){
        this();
        this.weight= weight;
        this.expiryDate = expire;
    }

    public Fruit(double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
