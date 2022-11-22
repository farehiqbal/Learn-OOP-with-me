package LAB8.Q1;

class Circle implements Shape{
    private double radius;

    Circle(){
        this(0);
    }

    Circle(double x){
        this.radius = x; 
    }

    @Override
    public double getArea(){

        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    
}