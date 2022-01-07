package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount();
        account.setCustomerName("Siddharth");
        account.setEmail("sid");
        account.setAccountNumber(123456789);
        account.setBalance(1000);
        account.setPhoneNumber("9999999999");

        System.out.println(account.getCustomerName());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getEmail());

        account.withdrawFunds(200);
        account.depositFunds(1000);
        System.out.println(account.getBalance());
    }
}
