package learning;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static final ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234-50", 1000);
        new Thread(new Person1(bankAccount)).start();
        new Thread(new Person2(bankAccount)).start();
    }

    private static class Person1 implements Runnable {
        private final BankAccount bankAccount;
        public Person1(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }
        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("Person1: Depositing 300");
                bankAccount.deposit(300);
                System.out.println("Available Balance: " + bankAccount.getBalance());
                System.out.println("Person1: Withdrawing 50");
                bankAccount.withdraw(50);
                System.out.println("Available Balance: " + bankAccount.getBalance());
            } finally {
                lock.unlock();
            }
        }
    }

    private static class Person2 implements Runnable {
        private final BankAccount bankAccount;
        public Person2(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }
        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("Person2: Depositing 203.75");
                bankAccount.deposit(203.75);
                System.out.println("Available Balance: " + bankAccount.getBalance());
                System.out.println("Person2: Withdrawing 100");
                bankAccount.withdraw(100);
                System.out.println("Available Balance: " + bankAccount.getBalance());
            } finally {
                lock.unlock();
            }
        }
    }
}
