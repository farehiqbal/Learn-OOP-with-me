package LAB5;

public class RectangleRunner {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(5,6);

        Rectangle r2 = new Rectangle(r1);

        Rectangle r3 = new Rectangle();

        System.out.println(r3.compareArea(r1));

        System.out.println(r1.equalRect(r2));

    }
}
