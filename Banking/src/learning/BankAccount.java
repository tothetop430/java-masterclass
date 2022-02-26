package learning;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double deposit(double amount, boolean branch) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount, boolean branch) {
//        if (amount <= this.balance) this.balance -= amount;
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    //More methods as required below
}
