package LAB7;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    

    public Employee() {
        this(" ", " ", " ");
    }



    public Employee(String firstName, String lastName, String sSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = sSN;
    }

    

    @Override
    public String toString() {
        Queue<Integer> q = new LinkedList<>();
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
    }



    public abstract double earnings();

}
