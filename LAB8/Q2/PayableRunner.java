package LAB8.Q2;

public class PayableRunner {

    public static void main(String[] args) {
    
        Payable invoice = new Invoice("8585", "part", 5, 5.0);
        
        Payable employee = new SalariedEmployee("armughan", "Safdar", "050", 5355);


        System.out.println(invoice.getPaymentAmount());
        System.out.println(employee.getPaymentAmount());
    }
}
