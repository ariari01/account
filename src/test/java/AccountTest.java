import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(10000);
    }

    @Test
    void createAccountTest() {
        assertNotNull(account);
    }

    @Test
    void createAccountInit10000won() {
        double ret = account.getBalance();
        assertEquals(10000, ret);
    }

    @Test
    void depositAndConfirmation() {
        account.deposit(400);
        double ret = account.getBalance();
        assertEquals(10400, ret);
    }

    @Test
    void withdrawAndConfirmation() {
        account.withdraw(600);
        double ret = account.getBalance();
        assertEquals(9400, ret);
    }

    @Test
    void applyFivePercentInterest() {
        account.appliyInterestForFive();
        int ret = account.getBalance();
        assertEquals(10500, ret);
    }

    @Test
    void compoundInterestAndConfirmation() {
        account.compoundInterest( 1);
        double ret = account.getBalance();
        assertEquals(11000, ret);
    }

    @Test
    void getAccountRate() {
        account.modifyAccountRate(0.10);
        account.compoundInterest( 1);
        double ret = account.getBalance();
        assertEquals(11000, ret);
    }

    @Test
    void getAccountRate2years() {
        account.modifyAccountRate(0.20);
        account.compoundInterest( 2);
        double ret = account.getBalance();
        assertEquals(14400, ret);
    }
}