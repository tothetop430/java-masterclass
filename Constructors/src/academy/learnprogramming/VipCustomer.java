package academy.learnprogramming;

public class VipCustomer {

    private String name, email;
    private int creditLimit;

    public VipCustomer() {
        this("Siddharth", "sidd.com", 750);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public VipCustomer(String name, String email) {
        this(name, email, 800);
    }

    public VipCustomer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public void showCustomerDetails() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Email: " + this.email);
        System.out.println("Customer Credit Score: " + this.creditLimit);
    }

}
