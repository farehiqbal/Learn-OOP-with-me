package AssignmentThree;

public class Circle extends GeometricObject{
    
    private double radius;
    
    public Circle() {
        radius  = 0;
    }

    public Circle(boolean isFilled,String color,double thickness,double radius) {
        super(isFilled, color, thickness);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return (Math.PI*Math.pow(this.radius, 2));
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + ", radius=" + radius + ", getCircleArea()=" + getCircleArea() + "]";
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.equals(o)) {
            System.out.println("Both circles are Same.");
            return 0;
        }
        else {
            System.out.println("Both circles are not same.");
        }
        return 1;   
    }
}





