package LAB8.Q2;

public class Invoice implements Payable{
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice() {
        this(" "," ",0,0);
    }


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }



    @Override
    public String toString() {
        return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
                + ", pricePerItem=" + pricePerItem + "]";
    }


    @Override
    public double getPaymentAmount(){

        return this.quantity*this.pricePerItem;
    }


}
