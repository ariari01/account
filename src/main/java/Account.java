public class Account {
    private int balance;
    private double rate = 0.10;

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

    public void compoundInterest(int years) {
        balance = (int)(balance * Math.pow(1 + rate, years));
    }

    public void modifyAccountRate(double rate) {
        this.rate = rate;
    }

    public void appliyInterestForFive() {
        int r = (int)(balance * 0.05);
        balance += r;
    }
}
