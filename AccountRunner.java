import LAB3.Account;

public class AccountRunner {
    
    public static void main(String[] args) {
        
        Account account1 = new Account(1000, "2021", "2123-1414421-4");

        account1.display();
        account1.withDraw(5);
        account1.display();
        account1.deposit(5);
        account1.display();
        System.out.println(account1.ageOfAccount());

        account1.setValues(2000, "2023", "6969");
        
        account1.display();
        
    }

    
}
