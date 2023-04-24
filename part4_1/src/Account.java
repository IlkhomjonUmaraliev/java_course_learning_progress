/**
 * Created by dev on 24/04/2023
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int number;

    public Account() {
        this(0, 0.00, "John Doe", "johndoe@gmail.com", 1234567);
        System.out.println("If the end user does not pass any parameters for the Account class, these default values will be" +
                "added and used. It is for safety purposes");
        System.out.println("Constructor with default parameters was called");
    }

    public Account(int accountNumber, double balance, String customerName) {
        this(accountNumber, balance, customerName, "dafaultemail@gmail.com", 1223445);
        System.out.println("Constructor with default parameters and user defined parameters");
    }

    public Account(int accountNumber, double balance, String customerName, String email, int number) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.number = number;

        System.out.println("Constructor with all the parameters which must be passed by end user");
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount) {
        if(amount >= 50) {
            this.balance = this.balance + amount;
            System.out.println(amount + " was deposited to your bank account");
        } else {
            System.out.println("Can not deposit! Amount is low");
        }
    }

    public void withdraw(double amount) {
        if(this.balance - amount >= 50) {
            this.balance = this.balance - amount;
            System.out.println(amount + " was withdrawn from your bank account");
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void showInfo() {
        System.out.println("The account number: " + this.getAccountNumber() + " \n" + " The customer name: " + this.getCustomerName() + " " +
                "\n" + " The balance " + this.getBalance() + " \n " + " Phone number " + this.getNumber() + "\n " + "Email " + this.getEmail());
    }


}
