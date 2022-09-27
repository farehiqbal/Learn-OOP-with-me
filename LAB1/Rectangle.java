public class Rectangle {
    
    public float length;
    public float width;
    public float perimeter;
    public float area;


    public Rectangle(float length, float width, float perimeter, float area) {
        this.length = length;
        this.width = width;
        this.perimeter = perimeter;
        this.area = area;
    }


    public float getLength() {
        return length;
    }


    public void setLength(float length) {
        this.length = length;
    }


    public float getWidth() {
        return width;
    }


    public void setWidth(float width) {
        this.width = width;
    }


    public float getPerimeter() {
        return perimeter;
    }


    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }


    public float getArea() {
        return area;
    }


    public void setArea(float area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "Rectangle [area=" + area + ", length=" + length + ", perimeter=" + perimeter + ", width=" + width + "]";
    }


    

    


    
}
