package LAB5;


public class Rectangle {
    
   private float length;
   private float width;

    
    public Rectangle(float length, float width) {
        if (length < 0 || width < 0)
            return;
        this.length = length;
        this.width = width;
    }


    public Rectangle() {
    
    }

    public Rectangle(Rectangle rect){
        this.length = rect.length;
        this.width = rect.width; 
    }

    public Rectangle compareArea(Rectangle r){

        if(this.Area() > r.Area()) return this;

        else return r;
    
    }

    public boolean equalRect(Rectangle rect){

        if (this.length == rect.length && this.width == rect.width) return true;

        return false;
    }
   
    public void display(){

        System.out.println(length + " " + width);

    }


    public double Area(){

        return this.length * this.width;
    }

    public boolean checkSquare(){

        if(this.length == this.width)
            return true;


        return false;
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


    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    
    

}
