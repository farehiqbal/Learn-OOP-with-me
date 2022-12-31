package Lab_Assignment3;

public class Student_lab extends Person_lab {
    private String Reg_no;
    private float GPA;
    private int Semester;
    private Department dep;

    public Student_lab(String reg_no, float gPA, int semester) {
        Reg_no = reg_no;
        GPA = gPA;
        Semester = semester;
    }

    public Student_lab(String name, String email, String gender, String reg_no, float gPA, int semester, Department dept) {
        super(name, email, gender);
        Reg_no = reg_no;
        GPA = gPA;
        Semester = semester;
        dep = dept;
    }

    public Department getDepartment() {
        return dep;
    }

    public void setDepartment(Department dep) {
        dep = dep;
    }

    public String getReg_no() {
        return Reg_no;
    }

    public void setReg_no(String reg_no) {
        Reg_no = reg_no;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float gPA) {
        GPA = gPA;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return super.toString() + "Student_lab [Reg_no=" + Reg_no + ", GPA=" + GPA + ", Semester=" + Semester + ", dep="
                + dep + "]";
    }

}