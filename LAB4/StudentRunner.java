package LAB4;

public class StudentRunner {
    
    public static void main(String[] args) {
        String[] stu1Array = {"math","eng","isl","ps","ict"};
        Student stu1 = new Student("Student1", 2.9f, "student1@cms.pk", stu1Array);

        String[] stu2Array = {"math","oop","isl","dsa","ict"};
        Student stu2 = new Student("Student2", 2.9f, "student2@cms.pk", stu2Array);


        if(stu1.getGpa() == stu2.getGpa()){
            System.out.println("Equal GPA");
        }
    }
}
