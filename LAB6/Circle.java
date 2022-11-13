package LAB6;

public class Circle {
    private float radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double Area(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}