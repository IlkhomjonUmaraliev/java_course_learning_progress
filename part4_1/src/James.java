public class James {

    private int balance;
    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        if(this.balance - amount >= 50) {
            System.out.println("$" + amount + " has been withdrawn from you balance!");
            this.balance = this.balance - amount;
            showInfo();
        } else {
            System.out.println("Cannnot process!");
        }
    }

    public void showInfo() {
        System.out.println("Name of the user: " + getUser() + " " + " their balance: $" + getBalance());
    }
}
