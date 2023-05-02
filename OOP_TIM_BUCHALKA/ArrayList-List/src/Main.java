import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will create a list of your groceries");
        ArrayList<String> groceries = new ArrayList<>();

        while(true) {
            System.out.println("Type the name of the product you want yo buy, type stop to cancel the process");
            String item = scanner.nextLine();

            if(item.equalsIgnoreCase("stop")) {
                break;
            }
            groceries.add(item);
        }
        System.out.println(groceries);
    }
}