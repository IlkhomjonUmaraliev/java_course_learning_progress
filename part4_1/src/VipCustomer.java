public class VipCustomer {
    private String firstName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Vip Customer", 10000.0, "vipcustomer@gmail.com");
    }


    public VipCustomer(String firstName, double creditLimit) {
        this(firstName, creditLimit, "customerwithoutemail@gmail.com");
    }

    public VipCustomer(String firstName, double creditLimit, String emailAddress) {
        this.firstName = firstName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void showInfo() {
        System.out.println("Name: " + this.getFirstName() + " \n " + " Credit Limit " + this.getCreditLimit() + "\n " + "Email Address " +
                this.getEmailAddress());
    }
}
