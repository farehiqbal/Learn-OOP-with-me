package Project.Products;

import Project.Utils.Date;

public class Dairy extends Food {
     
    // private double weight;
    private Date expiryDate;

    public Dairy() {
        type = GoodsType.PERISHABLE;
    }
    

    public Dairy(double weight, Date expiryDate){
        
        this();
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    public Dairy(double _weight, double _price){
        this();
        this.weight = _weight;
        this.price = _price;
    }

    // public double getWeight() {
    //     return weight;
    // }

    // public void setWeight(double weight) {
    //     this.weight = weight;
    // }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

}

