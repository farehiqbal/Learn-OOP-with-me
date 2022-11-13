package LAB6;
import java.util.Arrays;

public class PizzaOrder {
    private Pizza[] quantity = new Pizza[3];

    public PizzaOrder(Pizza p){
        this.quantity[0] = p;
    }

    public PizzaOrder(Pizza p,Pizza p1){
        this.quantity[0] = p;
        this.quantity[1] = p1;
    }

    public PizzaOrder(Pizza p, Pizza p1, Pizza p2){
        this.quantity[0] = p;
        this.quantity[1] = p1;
        this.quantity[2] = p2;
    }

    public PizzaOrder(Pizza[] quantity, Pizza pizza) {
        for (int i = 0; i < 2; i++) {
            if (quantity[i] == null) {
                this.quantity[i] = new Pizza();
                break;
            }
        }
    }

    public Pizza[] getQuantity() {
        return quantity;
    }

    public double calcTotalCost(){
        double calcTotalCost = 0;
        for (int i = 0; i < 2; i++){
            if(this.getQuantity()[i] != null) {
                calcTotalCost += this.quantity[i].calcCost();
            }
        }
        return calcTotalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + Arrays.toString(quantity) +
                '}';
    }
}