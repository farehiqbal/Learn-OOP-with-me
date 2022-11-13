package LAB6;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double Area(){
        return this.getLength()+this.getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle_Composition{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}