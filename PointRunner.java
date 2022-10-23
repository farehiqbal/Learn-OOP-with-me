

public class PointRunner {
    
   public static void main(String[] args) {
    

    Point[] points = new Point[10];

        points[0] = new Point();
        points[1] = new Point();
        points[2] = new Point();
        points[3] = new Point();
        points[4] = new Point();
        points[5] = new Point(1,2);
        points[6] = new Point(3,4);
        points[7] = new Point(5,6);
        points[8] = new Point(6,7);
        points[9] = new Point(7,8);

        for (int i = 0; i < 5; i++) {
            points[i].setY(19);
        }

        for (int i = 5; i < 10; i++) {
            points[i].move(3, 4);
        }

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i].toString());
        }
   }

}
