package AssignmentFour;

public class Runner {
    
    public static void main(String[] args) {
        
        CustomArraylist<Integer> list = new CustomArraylist<>();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        System.out.println(list.toString());


        CustomArraylist<Double> db = new CustomArraylist<>();

        for (int i = 0; i < 5; i++) {
            db.insert(i*10);
        }

        System.out.println(db.toString());
    }
}
