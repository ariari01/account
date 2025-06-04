public class Account {
    private double balance;
    private double rate = 0.10;

    public Account(int money) {
        this.balance = money;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }

    public void compoundInterest(int years) {
        balance = balance * Math.pow(1 + rate, years);
    }

    public void modifyAccountRate(double rate) {
        this.rate = rate;
    }
}
