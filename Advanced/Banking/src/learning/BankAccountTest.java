package learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        System.out.println("Tests Running...");
    }

    @Test
    void deposit() {
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @ParameterizedTest
    @CsvSource({"100,true,1100", "200,true,1200", "300,true,1300"})
    void deposit(double amount, boolean branch, double result) {
        double balance = bankAccount.deposit(amount, branch);
        assertEquals(result, balance, 0);
    }

    @Test
    void withdraw_branch() {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test
    void withdraw_notBranch() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(600.00, false));
    }

    @Test
    void getBalance_deposit() {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue(bankAccount.isChecking());
    }

    @Test
    public void isChecking_false() {
        bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.SAVINGS);
        assertFalse(bankAccount.isChecking());
    }

    @AfterAll
    static void teardown() {
        System.out.println("Shutting down unit test cases.");
    }
}