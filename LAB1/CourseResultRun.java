public class CourseResultRun {
    
    public static void main(String[] args) {
        
        CourseResult c1 = new CourseResult();

        c1.studentName = "Ali";
        c1.courseName = "OOP";
        c1.grade = "A";
        c1.display();

        CourseResult c2 = new CourseResult();
        c2.studentName = "Saba";
        c2.courseName = "ICP";
        c2.grade = "A+";
        c2.display();
    }
}
