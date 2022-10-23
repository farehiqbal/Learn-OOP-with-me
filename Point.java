
public class Point {

    private float x;
    private float y;


    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public Point() {
        this.x = 1f;
        this.y = 1f;

    }

    public void display(){

        System.out.println(this.x + " " + this.y);


    }

    public void move(float new_x, float new_y){

        this.x += new_x;
        this.y += new_y;
    }
    
    public boolean checkOrigin(){
        
        if(this.x == 0.0f && this.y == 0.0f) return true;
         
        
        return false;
    }


    public float getX() {
        return x;
    }


    public void setX(float x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }


    public void setY(float y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    
}
