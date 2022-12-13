package AssignmentThree;

public abstract class GeometricObject implements Cloneable, Comparable<Object>{

    private boolean isFilled;
    private String color;
    private double thickness;
    
    public GeometricObject() {
        this(false, "NULL", 0.0);
    }

    public GeometricObject(boolean isFilled, String color, double thickness) {
        this.isFilled = isFilled;
        this.color = color;
        this.thickness = thickness;
    }

    public boolean getFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GeometricObject other = (GeometricObject) obj;
        if (isFilled != other.isFilled)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (thickness != other.thickness)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Geometric Object [isFilled=" + isFilled + ", color=" + color + ", thickness=" + thickness + "]";
    }
}    

