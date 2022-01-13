package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printType) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        System.out.println("Customer details for branch " + branchName);
        for (int i=0; i<branch.getCustomers().size(); i++) {
            Customer customer = branch.getCustomers().get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
            if (printType) {
                System.out.println("Transactions");
                for (int j=0; j<customer.getTransactions().size(); j++) {
                    Double transaction = customer.getTransactions().get(j);
                    System.out.println("[" + (j+1) + "] " + " Amount " + transaction);
                }
            }
        }
        return true;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String custName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.newCustomer(custName, transaction);
    }

    public boolean addCustomerTransaction(String branchName, String custName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        return branch.addCustomerTransaction(custName, transaction);
    }

}
