package academy.learnprogramming;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName, email, phoneNumber;

    public BankAccount() {
        this(1010, 1000, "sid", "sid", "999999999");
        System.out.println("Empty Constructor Called");
    }
    public BankAccount(int accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Initialising Constructor Called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(123456789, 1000, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int acc) {
        this.accountNumber = acc;
    }
    public void setBalance(double bal) {
        this.balance = bal;
    }
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }

    public void depositFunds(double value) {
        if (value <= 0) System.out.println("Please try again");
        else {
            System.out.println("Depositing Funds");
            System.out.println("Depositing Funds = " + value);
            this.balance += value;
            System.out.println("Updated Balance = " + this.balance);
        }
    }
    public void withdrawFunds(double value) {
        if (this.balance < value) System.out.println("Insufficient Funds, Available Balance = " + this.balance);
        else {
            System.out.println("Withdrawing Funds");
            System.out.println("Withdrawn Amount = " + value);
            this.balance -= value;
            System.out.println("Remaining Amount = " + this.balance);
        }
    }

}
