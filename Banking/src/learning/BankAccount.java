package learning;

public class BankAccount {

    private final String firstName;
    private final String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private final int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
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

    public int getAccountType() {
        return accountType;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    //More methods as required below
}
