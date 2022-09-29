public class QuadraticEquationRunner {
    

    public static void main(String[] args) {
        
        QuadraticEquation eq1 = new QuadraticEquation(9, 22, 5);

        eq1.display();
        System.out.println(eq1.getDiscriminant());
        System.out.println(eq1.checkIfDiscriminantIsGreaterThan100());

        eq1.setValues(100, 200, 5);
        eq1.display();
    }
}
