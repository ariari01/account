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
    void createAccountInit10000won() {
        assertEquals(10000, account.getBalance());
    }

    @Test
    void depositAndConfirmation() {
        account.deposit(400);
        assertEquals(10400, account.getBalance());
    }

    @Test
    void withdrawAndConfirmation() {
        account.withdraw(600);
        assertEquals(9400, account.getBalance());
    }

    @Test
    void applyFivePercentInterest() {
        account.applyInterestForFive();
        assertEquals(10500, account.getBalance());
    }

    @Test
    void setterInterest() {
        account.setInterestPer(5);
        account.applyInterest();
        assertEquals(10500, account.getBalance());
    }

    @Test
    void predictNYearInterest() {
        account.setInterestPer(10);
        int ret = account.predictBalance(3);
        assertEquals(13310, ret);
    }
}