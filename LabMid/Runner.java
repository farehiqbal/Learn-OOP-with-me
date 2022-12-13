package LabMid;

public class Runner {
    public static void main(String[] args) {
        

        Customer customer = new Customer("Cust", 20, "10", "password");

        Shop shop = new Shop("Man");
    
        Order order= new Order(customer);

        order.takeOrder("Item_name");
        order.ApplyDiscount();
        System.out.println(order.getTotalBill());

    }
}
