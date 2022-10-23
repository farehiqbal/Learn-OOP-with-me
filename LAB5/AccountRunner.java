package LAB5;

import java.sql.PseudoColumnUsage;

public class AccountRunner {
    
    public static void main(String[] args) {
        

        Account account1 = new Account();
        Account account2 = new Account(500,"2023","586258");
        Account account3 = new Account(account2);

        System.out.println(account2.equalAccounts(account3));
        


    }
}
