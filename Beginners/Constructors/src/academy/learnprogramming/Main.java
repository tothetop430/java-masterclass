package academy.learnprogramming;

import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
//	    BankAccount account = new BankAccount();
//        account.setCustomerName("Siddharth");
//        account.setEmail("sid");
//        account.setAccountNumber(123456789);
//        account.setBalance(1000);
//        account.setPhoneNumber("9999999999");
//
//        System.out.println(account.getCustomerName());
//        System.out.println(account.getPhoneNumber());
//        System.out.println(account.getAccountNumber());
//        System.out.println(account.getBalance());
//        System.out.println(account.getEmail());
//
//        account.withdrawFunds(200);
//        account.depositFunds(1000);
//        System.out.println(account.getBalance());

//        BankAccount newAccount1 = new BankAccount();
//        BankAccount newAccount2 = new BankAccount(1234567890, 1000, "Abhishek",
//                "abhi.com", "000000000");
//        BankAccount newAccount3 = new BankAccount("Siddharth", "sid.com",
//                "9999999999");
//
//        System.out.println(newAccount1.getAccountNumber());
//        System.out.println(newAccount2.getAccountNumber());
//        System.out.println(newAccount3.getAccountNumber());

        VipCustomer cust1 = new VipCustomer();
        VipCustomer cust2 = new VipCustomer("Abhishek", "abhi");
        VipCustomer cust3 = new VipCustomer("Tanuja", "tanuja", 760);

        cust1.showCustomerDetails();
        cust2.showCustomerDetails();
        cust3.showCustomerDetails();

    }
}
