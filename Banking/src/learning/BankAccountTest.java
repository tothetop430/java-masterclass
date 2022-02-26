package learning;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        double balance = bankAccount.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
    }

    @Test
    void getBalance_deposit() {
        BankAccount bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {

    }

    @Test
    public void isChecking_false() {

    }
}