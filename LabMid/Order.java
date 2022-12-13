package LabMid;

import java.util.Arrays;

public class Order {
    private Item[] items = new Item[30];
    private Customer c;
    private double totalBill;
    
    
    public Order(Customer c) {
        this.c = c;
    }

    void takeOrder(String item_name){
        
        double price = 1;

        if((price = Shop.buy(item_name)) >= 0){
            totalBill += price;
        }

    }

    void ApplyDiscount(){

        if(Shop.findCustomer(c.getCustID())){
            double discount = (totalBill * 10)/ 100;

            this.totalBill -= discount;
        }
    }

    double getTotalBill(){
        ApplyDiscount();
        return this.totalBill;
    }

    @Override
    public String toString() {
        return "Order [items=" + Arrays.toString(items) + ", Customer=" + c + ", totalBill=" + totalBill + "]";
    }





    
}
