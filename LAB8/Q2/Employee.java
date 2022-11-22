package LAB8.Q2;

public abstract class Employee implements Payable{
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee() {
        this(" ", " ", " ");
    }


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
                + socialSecurityNumber + "]";
    }

    

    
}
