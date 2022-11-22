package LAB8.Q2;

public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    public SalariedEmployee() {
        this(" ", " ", " ", 0);
    }


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double ws) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = ws;
    }



    @Override
    public double getPaymentAmount(){

        return this.weeklySalary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
    }

    


}
