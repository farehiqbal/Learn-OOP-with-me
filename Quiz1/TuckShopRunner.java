package Quiz1;

public class TuckShopRunner {
    
    public static void main(String[] args) {

        
        String[] ts1FoodItems = {"Pizza", "burger", "pasta"};
        double[] ts1Price = {98.9, 434, 24.9};
        int[] ts1quantity = {10,0,10};
        
        TuckShop ts1 = new TuckShop("Owner1", ts1FoodItems, ts1Price, ts1quantity);


        String[] ts2FoodItems = {"Coffee", "Juice", "Tea"};
        double[] ts2Price = {111.9, 34, 28};
        int[] ts2quantity = {20,10,0};

        
        TuckShop ts2 = new TuckShop("Owner2", ts2FoodItems, ts2Price, ts2quantity);


        // ts1.display();
        // ts2.display();

        // System.out.println(ts1.compareOwner(ts2));

        // ts1.addFoodItem("Snacks", 15.6, 2);
        // ts1.display();


        // ts1.buyItem("burger");
        // ts1.display();

        (ts1.compareTwoShops(ts2)).display();
    }
}
