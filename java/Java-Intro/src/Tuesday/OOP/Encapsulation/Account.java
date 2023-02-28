package Tuesday.OOP.Encapsulation;

// bank account class:
public class Account {
    // here we use a private modifier to make it so that this field cannot be accessed
    // from outside of this class:
    private double balance;

    // we make a static variable here because this limit applies to all accounts
    // it won't vary between accounts
    static double LIMIT = 10000;

    // Getter, public and returns the private variable:
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if(balance > Account.LIMIT) {
            System.out.println("Account limit exceeded, deposit rejected: " + balance);
        }
        else {
            this.balance = balance;
        }
    }

    // Setter, public and takes in a value and adds it to our balance:
    public void deposit(double balance) {
        // take the parameter and assign its value to our instance field:
        // let's say this limit on a basic account of $10000
        double newBalance = this.balance + balance;
        if(newBalance > Account.LIMIT) {
            System.out.println("Account limit exceeded, deposit rejected: " + balance);
        }
        else {
            this.balance = newBalance;
        }
    }
}
