package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Siddharth", 1000);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(200);
        System.out.println("Balance for customer " + customer.getBalance());

        ArrayList<Integer> myIntList = new ArrayList<>();

        myIntList.add(1);
        myIntList.add(3);
        myIntList.add(4);

        printArrayList(myIntList);

        myIntList.add(1, 2);        // extra overhead to shift numbers

        printArrayList(myIntList);
    }

    private static void printArrayList(ArrayList<Integer> arrayList) {
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}

