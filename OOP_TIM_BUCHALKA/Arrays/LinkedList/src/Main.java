import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Anna", 100);
        Customer anotherCustomer = customer;

        anotherCustomer.setBalance(1009);

        System.out.println(customer.getBalance());
        System.out.println(anotherCustomer.getBalance());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        for(int num : numbers) {
            System.out.println(num);
        }


    }
}