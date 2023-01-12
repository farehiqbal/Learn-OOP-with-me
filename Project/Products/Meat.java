package Project.Products;

import Project.Utils.Date;

public class Meat extends Food {
     
    private Date expiryDate;

    public Meat() {
        type = GoodsType.PERISHABLE;
    }

    public Meat(double weight, Date expire){
        this();
        this.weight = weight;
        this.expiryDate = expire;
    }

    public Meat(double _weight, double _price){
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
