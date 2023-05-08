import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> deposits;
    private ArrayList<Double> withdrawals;
    private double balance = 0;

    public Customer(String name) {
        this.name = name;
        this.deposits = new ArrayList<>();
        this.withdrawals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double money) {
        if(money < 0) {
            System.out.println("Can't process it");
        } else {
            this.balance = this.balance + money;
            deposits.add(money);
            System.out.println("Deposited " + money + " on your bank account and your balance is " + this.getBalance());
        }
    }

    public void withdraw(double money) {
        if(this.getBalance() - money < 0) {
            System.out.println("Can't process it");
        } else {
            this.withdrawals.add(money);
            this.balance = this.balance - money;
            System.out.println("Withdrew " + money + " from your account and your current balance is " + this.getBalance());
        }
    }

    public void printWithDrawls() {
        for(double withdrawal : withdrawals) {
            System.out.println(withdrawal);
        }
    }

    public void printDeposits() {
        for(double deposit : deposits) {
            System.out.println(deposit);
        }
    }

    public String toString() {
        return "Name of the person: " + this.name + " and his/her current balance is " + this.getBalance();
    }
}
