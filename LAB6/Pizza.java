package LAB6;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    
    public Pizza() {
        
    }

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost(){

        int totalToppingsPrice = 2 * (this.getCheeseToppings() + this.getPepperoniToppings() + this.getHamToppings());

        if (this.size == "small") return 10 + totalToppingsPrice;

        if (this.size == "medium") return 12 + totalToppingsPrice;

        return 14 + totalToppingsPrice;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", cheeseToppings=" + cheeseToppings + ", pepperoniToppings=" + pepperoniToppings
                + ", hamToppings=" + hamToppings + "]";
    }

    
    
}
