package LAB8.Q1;

public class Rectangle implements Shape{
    private double length;
    private double width;

    Rectangle(){
        this(0,0);
    }

    Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    @Override
    public double getArea(){

        return this.width*this.length;
    }
}
