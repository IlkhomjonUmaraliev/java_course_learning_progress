import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;



    public Branch(String name) {
        this.customers = new ArrayList<>();
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        if(customers.contains(customer)) {
            System.out.println("Customer already in our list");
        } else {
            customers.add(customer);
        }
    }

    public void printCustomer() {
        for(Customer customer : customers) {
            System.out.println(customer);
        }
    }


    public String toString() {
        return "Name of the branch is " + this.getName() + " and it has currently " + customers.size() + " customers";
    }
}
