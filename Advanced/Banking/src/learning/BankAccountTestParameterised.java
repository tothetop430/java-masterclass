package learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTestParameterised {

    private BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("ABC", "DEF",
                1000.00, BankAccount.CHECKING);
        System.out.println("Running...");
    }

    @ParameterizedTest
    @CsvSource({"100,true,1100", "200,true,1200", "300,true,1300"})
    void deposit(double amount, boolean branch, double result) {
        double balance = bankAccount.deposit(amount, branch);
        assertEquals(result, balance, 0);
    }
}
