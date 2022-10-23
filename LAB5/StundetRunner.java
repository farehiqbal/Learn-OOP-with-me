package LAB5;

class StudentRunner {
    
    public static void main(String[] args){
    Student s1 = new Student();
    String name = "Waqar";
    int [] marks = {87,98,99,32,66};
    s1.setName(name);
    s1.setResult(marks);
    s1.display();
    double average = s1.cal_average();
    System.out.println("\nAverage: " +average );

    Student s2 = new Student();
    String name2 = "Waqar";
    int [] marks3 = {87,98,99,32,66};
    s1.setName(name2);
    s1.setResult(marks3);



    //equal method
    System.out.println(s2.equal_data(s1));
        
    //comparison of average
    s2.compare_average(s1).display();
    
   }
}