package LAB4;

public class MarksRunner {
    
    public static void main(String[] args) {
        
        Marks one = new Marks(100, 20, 55);
        Marks two = new Marks(20, 40, 99);

        if(one.getMarks1() == two.getMarks1()){
            System.out.println("Equal marks in first subject.");
        }
        else {
            System.out.println("Not equal.");
        }
    }
}
