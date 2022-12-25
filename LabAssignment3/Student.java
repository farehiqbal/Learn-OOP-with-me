package LabAssignment3;


public class Student extends Person {
    
    private String regNo;
    private String gpa;
    private String semester;
    
    public Student() {
    }

    

    public Student(String regNo, String gpa, String semester) {
        this.regNo = regNo;
        this.gpa = gpa;
        this.semester = semester;
    }



    public Student(String name, String email, String gender, String regNo, String gpa, String semester) {
        super(name, email, gender);
        this.regNo = regNo;
        this.gpa = gpa;
        this.semester = semester;
    }



    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    
   
}
