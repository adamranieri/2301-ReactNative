package Tuesday.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(100.00);
        account.deposit(100.00);
        account.deposit(100.00);
        account.deposit(100000.00);
        account.setBalance(10000000);
        account.setBalance(9000);
        account.deposit(2000);

        // we can't directly access the balance property because it is private:
//        account.balance = 20;
        System.out.println("Balance: " + account.getBalance());

    }
}
