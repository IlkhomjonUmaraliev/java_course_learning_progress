import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sweathearts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> sweathearts = new ArrayList<>();
        System.out.println("This fucking program will create a list of your girlfriends/boyfriends");

        while (true) {
            System.out.println("Please enter the name");
            String name = scanner.nextLine();
            System.out.println("Please enter the age of the person");

            if(name.trim().length() == 0) {
                break;
            }
            int age = 0;
            try {
                age = scanner.nextInt();
                if(age < 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Fuck you nigga");
            }


            sweathearts.add(new Person(name, age));
        }
        for(Person people : sweathearts) {
            System.out.println(people);
        }
    }
}
