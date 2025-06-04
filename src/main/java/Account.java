public class Account {
    int balance;
    int interestPer = 0;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public void applyInterestForFive() {
        setInterestPer(5);
        applyInterest();
    }

    public void setInterestPer(int interrestPer) {
        this.interestPer = interrestPer;
    }

    private int getInterest(int balance) {
        double rate = 0.01 * interestPer;
        return (int)(balance * rate);
    }

    public void applyInterest() {
        int interest = getInterest(balance);
        balance += interest;
    }

    public int predictBalance(int targetYear) {
        int predictBalance = balance;
        for (int year = 1; year <= targetYear; year++) {
            predictBalance += getInterest(predictBalance);
        }
        return predictBalance;
    }
}