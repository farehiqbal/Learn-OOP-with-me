package LAB3;
public class QuadraticEquation {
    
    float a;
    float b;
    float c;

    public QuadraticEquation(){
        a = 1f;
        b = 0.0f;
        c = 0.0f;

    }

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public void display(){

        System.out.println(a + " " + b + " " + c);


    }

    public void setValues(float new_a, float new_b, float new_c){

        this.a = new_a;
        this.b = new_b;
        this.c = new_c;

    }

    public double getDiscriminant(){

        return Math.sqrt((b*b) - (4*a*c));


    }

    public boolean checkIfDiscriminantIsGreaterThan100(){

        if(getDiscriminant() > 100){

            return true;
        }

        return false;
    }


    // Extras

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation [a=" + a + ", b=" + b + ", c=" + c + "]";
    }


    

    
}
