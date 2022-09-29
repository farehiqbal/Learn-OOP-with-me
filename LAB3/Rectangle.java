public class Rectangle {
    
    float length;
    float width;

    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    public Rectangle() {
        this.length = 1f;
        this.width = 1f;

    }

    public void display(){

        System.out.println(length + " " + width);

    }

    public void setValues(float new_length, float new_width){

        this.length = new_length;
        this.width = new_width;

    }

    public double calculateArea(){

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
