package LAB8.Q3;

public class Runner {
    public static void main(String[] args) {
        
        String myobj = new String("test");

        InventoryItem item1 = new InventoryItem("mango", 6);
        InventoryItem item2 = new InventoryItem("Apple", 9);

        System.out.println(item1.compareObjects(item1));

        System.out.println(item1.compareObjects(item2));

        System.out.println(item1.compareObjects(myobj));
    }
}
