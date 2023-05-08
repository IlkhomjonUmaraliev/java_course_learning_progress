import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> namesOfStudents = new LinkedList<>();
        System.out.println("This is the automated program for storing the names of students in alphabetical order!");

        while (true) {
            try {
                System.out.println("Please enter the name of the student!");
                String name = scanner.nextLine();
                orderStudentsNames(namesOfStudents, name);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printNamesOfStudents(LinkedList<String> nameOfStudents) {
        ListIterator<String> iterator = nameOfStudents.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void orderStudentsNames(LinkedList<String> list, String name) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            int value = iterator.next().compareTo(name);

            if (value == 0) {
                System.out.println("You cannot add this student because he/she is already in the list!");
            } else if (value > 0) {
                iterator.previous();
                iterator.add(name);
            }

        }
       iterator.add(name);
    }
}
