package AssignmentOne;

public class StudentRunner {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("Fareh Iqbal", "FA21-BCS-019", 450.10f);

        System.out.println(s1.grade());
        System.out.println(s2.grade());


    }


    
}
