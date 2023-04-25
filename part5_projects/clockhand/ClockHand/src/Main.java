import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // CLOCK APPLICATION

//        Clock clock = new Clock();
//        while(true) {
//            System.out.println(clock);
//            clock.advance();
//        }

        //CLOCK APPLICATION

        System.out.println("This program will give you some health information");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("How much do you weigh?");
        double weight = scanner.nextDouble();
        System.out.println("How tall are you?");
        double height = scanner.nextDouble();

        Person person = new Person(name, age, weight, height);
        System.out.println(person);
    }
}