package AssignmentThree;

public class Runner {
    public static void main(String[] args) {

        Circle c1 = new Circle (true,"Blue",2.5,5);
        Circle c2 = new Circle (false,"red",1.5,10);
        Rectangle r1 = new Rectangle(true,"Blue",2.5,4,5);
        Rectangle r2 = new Rectangle(false,"red",3.6,6,5);
        Rectangle r3 = new Rectangle(true,"green",4.5,1,5);
        Drawing draw = new Drawing();

        draw.add(c1);
        draw.add(c2);
        draw.add(r1);
        draw.add(r2);
        draw.add(r3);

        System.out.println("Total Area of Drawing is " + draw.calculateArea());
        System.out.println("Number of Filled Figures in the drawing is  "+draw.countFilled());
    }
}
