package LabMid;

public class Shop {
    
    private String owner;
    private static Item[] items= new Item[100];
    private static Customer[] cust = new Customer[100];

    Shop(String owner){

        this.owner = owner;
    }

    void AddItem(Item item){

        for (int i = 0; i < items.length; i++) {
            
            if(items[i] == null){
                items[i] = item;
                return;
            }
            
        }
    }

    void addCustomer(Customer customer){

        for (int i = 0; i < cust.length; i++) {
            if(cust[i] == null){
                cust[i] = customer;
                return;
            }
        }
    }

    static double buy(String item_name){
        double price = 1;
        for (int i = 0; i < items.length; i++) {
            
            if (items[i].getName() == item_name){
                price = items[i].getPrice();
                items[i] = null;
            }
        }

        return price;
    }

    static boolean findCustomer(String custID){

        for (int i = 0; i < cust.length; i++) {
            if (cust[i].getCustID() == custID) return true;
        }

        return false;
    }


}
