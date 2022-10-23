package Quiz1;

public class TuckShop {
    private String Owner;
    private String[] FoodItems = new String[100];
    private double[] Price = new double[100];
    private int[] Quantity = new int[100];


    public TuckShop() {

    }


    public TuckShop(String owner, String[] foodItems, double[] price, int[] quantity) {
        Owner = owner;

        int len = 0;

        if(foodItems.length < FoodItems.length){
            len = foodItems.length;
        }
        else{
            len = FoodItems.length;
        }

        for (int i = 0; i < len; i++) {
            this.FoodItems[i] = foodItems[i];
        }


        int len1 = 0;

        if(price.length < Price.length){
            len1 = price.length;
        }
        else{
            len1 = Price.length;
        }

        for (int i = 0; i < len1; i++) {
            this.Price[i] = price[i];
        }
        
        
        int len2 = 0;

        if(quantity.length < Quantity.length){
            len2 = quantity.length;
        }
        else{
            len2 = Quantity.length;
        }

        for (int i = 0; i < len2; i++) {
            this.Quantity[i] = quantity[i];
        }
        
    }

    public TuckShop(TuckShop ts){
        this.Owner = ts.Owner;
        this.FoodItems = ts.FoodItems;
        this.Price = ts.Price;
        this.Quantity = ts.Quantity;
    }


    public String getOwner() {
        return Owner;
    }


    public void setOwner(String owner) {
        Owner = owner;
    }

    
    public void display(){

        System.out.println("Owner: " + this.Owner);

        System.out.println("Food items: ");
        for (int i = 0; i < FoodItems.length; i++) {
            if(this.FoodItems[i] == null){
                continue;
            }
            else System.out.println("Food: "+ i + " "+ FoodItems[i] );
        }

        System.out.println("Prices wrt arranagement: ");
        
        for (int i = 0; i < Price.length; i++) {
            if(this.Price[i] == 0.0) continue;

            else System.out.println("Price: "+ i + " "+ Price[i] );
        }

        System.out.println("Quantity of each item: ");
        for (int i = 0; i < Quantity.length; i++) {
            if(this.Quantity[i] == 0) continue; 

            else System.out.println("Quantity: " + i + " "+ Quantity[i] );
        }

        System.out.println('\n');
    }

    public void addFoodItem(String item, double price, int quantity){

        if(this.FoodItems.length == FoodItems.length){
            System.out.println("Cant add food item. No space in inventory");
        }

        for (int i = 0; i < this.FoodItems.length; i++) {
            if(this.FoodItems[i] == null){
                this.FoodItems[i] = item;
                this.Price[i] = price;
                this.Quantity[i] = quantity;
                break;
            }
        }

        // for (int i = 0; i < this.Price.length; i++) {
        //     if(this.Price[i] == 0.0){
        //         this.Price[i] = price;
        //         break;
        //     }

        // }

        // for (int i = 0; i < this.Quantity.length; i++) {
        //     if(this.Quantity[i] == 0){
        //         this.Quantity[i] = quantity;
        //         break;
        //     }
        // }
    }

    public double buyItem(String item){

        int i;
        for (i = 0; i < this.FoodItems.length; i++) {
            if(this.FoodItems[i] == item){
                if(this.Quantity[i] == 0){
                    System.out.println("Not enough items");
                    break;
                }
                else{
                    this.Quantity[i]--;
                    break;
                }
            }
            else{
                continue;
            }
        }

        return this.Price[i];

    }

    public boolean compareOwner(TuckShop ts){

        return (this.Owner.equals(ts.Owner)? true : false);

    }

    public TuckShop compareTwoShops(TuckShop ts){

        int invokedSum = 0;

        for (int i = 0; i < this.Quantity.length; i++) {
            invokedSum += this.Quantity[i];
        }

        int calledSum = 0;

        for (int i = 0; i < ts.Quantity.length; i++) {
            calledSum += this.Quantity[i];
        }

        if(invokedSum > calledSum) return this;

        return ts;


    }
    

    
}
