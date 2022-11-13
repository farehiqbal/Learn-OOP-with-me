package LAB6;

public class Employee {
    private String firstName;
    private String lastName;
    private Date hireDate;
    private Date birthDate;
    private Job job;
    
    public Employee() {
    }

    public Employee(String firstName, String lastName, Date hireDate, Date birthDate, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = new Date(hireDate);
        this.birthDate = new Date (birthDate);
        this.job = job;
    }

    public Employee(Employee emp){

        this.firstName = emp.firstName;
        this.lastName = emp.lastName;
        this.birthDate = new Date(emp.birthDate);
        this.hireDate = new Date(emp.hireDate);
        this.job = emp.job;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return new Date (this.hireDate);
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = new Date (hireDate);
    }

    public Date getBirthDate() {
        return new Date(this.birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = new Date (birthDate);
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    
    public boolean equals(Employee e){

        if (this.firstName == e.firstName && this.lastName == e.lastName &&
            this.birthDate.equalsDate(e.birthDate) && this.hireDate.equalsDate(e.hireDate)
        ) return true;

        return false;
    }
    
    public boolean isExperienced(){

        return (2022 - this.getHireDate().getYear() >= 5);

        
    }

    public boolean isfiftyGrandSalary(){

        return (this.job.getSalary() > 50000);
    }
}
