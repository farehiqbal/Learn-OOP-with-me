package AssignmentThree;

public class Rectangle extends GeometricObject{
    private double length;
    private double width;
    
    public Rectangle() {
        this(false, "NUll", 0.0, 0.0, 0.0);
    }

    public Rectangle(boolean isFilled, String color, double thickness, double length, double width) {
        super(isFilled,color,thickness);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRectangleArea(){
        return (this.length * this.width);
    }
    
    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    @Override
    public int compareTo(Object o) {
        if(this.equals(o)) {
            System.out.println("Both rectangles Are Same.");
            return 0;
        }
        else {
            System.out.println("Both rectangles are not same.");
        }
        return 1;   
    }
}



