import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the elements you want to create");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter " + (i+1) + "th value");
            int current = scanner.nextInt();
            numbers[i] = current;
        }
        reverseArray(numbers);
    }

    public static void reverseArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int lengthOfArray = arr.length;
        int[] copyArray = new int[lengthOfArray];
        for (int j : arr) {
            copyArray[lengthOfArray - 1] = j;
            lengthOfArray = lengthOfArray - 1;
        }
        System.out.println(Arrays.toString(copyArray));
    }
}