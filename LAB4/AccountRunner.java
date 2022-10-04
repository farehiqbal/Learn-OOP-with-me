package LAB4;

public class AccountRunner {
    
    public static void main(String[] args) {
        
        Account account1 = new Account(100, "2022", "725825825");

        Account account2 = new Account(account1.getBalance(),"2023", "586528");
        
    }
}
