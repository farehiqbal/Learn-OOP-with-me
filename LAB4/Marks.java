package LAB4;

public class Marks {
    
    private int marks1;
    private int marks2;
    private int marks3;


    public Marks() {
    
    }


    public Marks(int marks1, int marks2, int marks3) {

        if(marks1 < 0) this.marks1 = 1;
        if(marks2< 0) this.marks2 = 1;
        if(marks3 < 0) this.marks3 = 1;

        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }


    public int getMarks1() {
        return marks1;
    }


    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }


    public int getMarks2() {
        return marks2;
    }


    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }


    public int getMarks3() {
        return marks3;
    }


    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }


    public void display(){
        System.out.println(this.marks1 + "" + this.marks2 + "" + this.marks3);
    }

    private int calculateTotalMarks(){

        return(this.marks1 + this.marks2 + this.marks3);
    }
    
    
    public float calculatePercentage(){

        float perc = (calculateTotalMarks() / 3 ) * 100;

        return perc;
    }

}
