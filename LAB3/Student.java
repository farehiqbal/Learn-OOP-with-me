import java.util.Scanner;

public class Student {
    
    String name;
    float gpa;
    String email;
    String subjects[] = new String[5];
    
    
    public Student() {
    }


    public Student(String name, float gpa, String email, String[] subjects) {
        this.name = name;
        this.gpa = gpa;
        this.email = email;
        this.subjects = subjects;
    }

    public void display(){

        System.out.println(this.name);
        System.out.println(this.gpa);
        System.out.println(this.email);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }

    }
    

    public void setValues(String newName, String newEmail, float newGpa){

        Scanner input = new Scanner(System.in);
        
        this.name = newName;
        this.gpa = newGpa;
        this.email = newEmail;

        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = input.next();
        }
        input.close();
    }

    public boolean checkProbStatus(){

        if(this.gpa < 2.0){
            return true;
        }

        return false;
    }

    public boolean validateEmail(){

        if(this.email.contains("@")){
            return true;
        }

        return false;
    }
    
}
