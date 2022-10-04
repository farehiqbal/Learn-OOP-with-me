package LAB4;


public class Student {
    
    private String name;
    private float gpa;
    private String email;
    private String subjects[] = new String[5];
    
    
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
    

    // public void setValues(String newName, String newEmail, float newGpa){

    //     Scanner input = new Scanner(System.in);
        
    //     this.name = newName;
    //     this.gpa = newGpa;
    //     this.email = newEmail;

    //     for (int i = 0; i < subjects.length; i++) {
    //         subjects[i] = input.next();
    //     }
    //     input.close();
    // }

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

    private int verifyArrayLength(int[] r){

        if(this.subjects.length < r.length)
            return this.subjects.length;
        else{
            return r.length;
        }
    }

    public int searchSubject(String subjectName){

        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i] == subjectName)
                return i;
        }

        return -1;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public float getGpa() {
        return gpa;
    }


    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String[] getSubjects() {
        return subjects;
    }


    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }   
    

    
}
