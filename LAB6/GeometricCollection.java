package LAB6;

import java.util.Arrays;

public class GeometricCollection {
    
    private Circle[] c = new Circle[10];
    private Rectangle[] r = new Rectangle[10];

    public GeometricCollection(Circle[] c, Rectangle[] r) {
        for (int i = 0; i < r.length; i++) {
            this.c[i] = c[i];
            this.r[i] = r[i];
        }
    }

    public GeometricCollection() {
    }

    public Circle[] getC() {
        return c;
    }

    public GeometricCollection(GeometricCollection g){
        this.c = g.c;
        this.r = g.r;
    }

    public double calculateArea(){
        double area = 0;
        for (int i = 0; i < 9; i++) {
            if(this.getC()[i] != null){
                area = area + this.getC()[i].Area();
            }
            if(this.getR()[i] != null){
                area += this.getR()[i].Area();
            }
        }
        return area;
    }

    public Rectangle[] getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Geometric_Collection{" +
                "c=" + Arrays.toString(c) +
                ", r=" + Arrays.toString(r) +
                '}';
    }
}
