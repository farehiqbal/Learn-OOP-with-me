package LAB5;
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

    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public Point addTwoPoints(Point p){

        float newx = this.x + p.x;
        float newy = this.y + p.y;

        Point temp = new Point(newx, newy);

        return temp;
    }

    public Point addThreePoints(Point p1, Point p2){

        float newx = this.x + p1.x + p2.y;
        float newy = this.y + p1.y + p2.y;

        Point temp = new Point (newx, newy);

        return temp;
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
