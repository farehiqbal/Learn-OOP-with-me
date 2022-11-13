package LAB6;

public class Job {
    private String designation;
    private int salary;
    private String id;

    public Job() {

    }


    public Job(String designation, int salary, String id) {
        this.designation = designation;
        this.salary = salary;
        this.id = id;
    }

    

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    
}
