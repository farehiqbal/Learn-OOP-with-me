package LAB4;

public class PointRunner {
    
    public static void main(String[] args) {
        
        Point point1 = new Point();
        Point point2 = new Point(1f, point1.getX());

        if(point1.getX() == point2.getY()){
            System.out.println("X coordinate of point1 equals Y coordinate of point2");
        }

    }

}
