package LAB5;

public class UniversityRunner {
    

    public static void main(String[] args) {
        
        University uni1 = new University();

        String[] uni2Deps = {"CS", "EE","BBA"};
        University uni2 = new University("Comsats","Islamabad", "Mangral", uni2Deps);

        University uni3 = new University(uni2);

        // System.out.println(uni1.compareUniversity(uni2));
    }
}
