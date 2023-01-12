package Project.Products;

public class Grains extends Food{
    
    
    public Grains() {
        type = GoodsType.NONPERISHABLE;
    }

    public Grains(double _weight, double _price){
        this.weight = _weight;
        this.price = _price;
    }

}
