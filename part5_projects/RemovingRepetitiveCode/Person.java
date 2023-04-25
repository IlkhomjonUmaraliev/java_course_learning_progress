public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0, "1234567");
        System.out.println("Constructor with Name and Lastname called");
    }


    public Person(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructors with all parameters called");
    }

    public String toString() {
        return "Firstname: " + this.firstName + " \n" + "Lastname" + this.lastName + " \n" + "Age " + this.age +
                "\n" + "Phone number" + this.phoneNumber;
    }
}
