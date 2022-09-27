
public class Circle {

    public boolean isUnitcricle;
    public float area;
    public float circumference;
    
    public Circle(boolean isUnitcricle, float area, float circumference) {
        this.isUnitcricle = isUnitcricle;
        this.area = area;
        this.circumference = circumference;
    }

    public boolean isUnitcricle() {
        return isUnitcricle;
    }

    public void setUnitcricle(boolean isUnitcricle) {
        this.isUnitcricle = isUnitcricle;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCircumference() {
        return circumference;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "Circle [area=" + area + ", circumference=" + circumference + ", isUnitcricle=" + isUnitcricle + "]";
    }

    
    
}
