package learning;

public class BankAccount {

    private double balance;
    private final String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        synchronized (this) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            this.balance -= amount;
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number = " + this.accountNumber);
    }

}
