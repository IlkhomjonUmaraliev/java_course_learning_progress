import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nima gap eshshaklar! Menda bitta savol bor \n");
        System.out.println("Ta'til nima degani ingliz tilida?");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("holiday")) {
            System.out.println("Yo buddy. You are the best");
        } else if(answer.equalsIgnoreCase("vacation")) {
            System.out.println("Chota amerikalikmisan deyman. Lekin to'gri");
        } else {
            System.out.println("Camera WoWo");
        }
    }
}
