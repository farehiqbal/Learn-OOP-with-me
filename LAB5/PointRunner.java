package LAB5;

public class PointRunner {
    
    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point(5, 6);
        Point p3 = new Point(p1);

        System.out.println(p1.addTwoPoints(p2));
        System.out.println(p1.addThreePoints(p2, p3));
    }
 
 }
 