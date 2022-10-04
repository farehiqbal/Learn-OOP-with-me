package LAB4;

public class RectangleRunner {
    
    public static void main(String[] args) {
        
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(1, 1);

        rec2.display();
        if(rec1.getLength() > rec2.getLength()){

            System.out.println("Rec1 has greater length");
        }
        else if (rec1.getLength() < rec2.getLength()){
            System.out.println("Rec2 has greater length");
        }

        else{
            System.out.println("Equal");
        }



    }
}
