package LAB8.Q1;

public class ShapesRunner {
    public static void main(String[] args) {
        

        Circle circle = new Circle(1);
        System.out.println(circle.getArea());

        Rectangle rect = new Rectangle(443.5, 4224.3);
        System.out.println(rect.getArea());
    }
}
