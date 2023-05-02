import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will create an array using your inputs" +
                "and find the minimum value in the array");
        System.out.println("Please enter the number of elements you want to create");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the " + (i+1) + "th value");
            int temp = scanner.nextInt();
            numbers[i] = temp;
        }

        getIntegers(numbers);
        System.out.println("The minimum number in the given array is " + getMinimum(numbers));
    }

    public static void getIntegers(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int getMinimum(int[] arr) {
        int min = arr[0];

        for(int num : arr) {
            if(min > num) {
                min = num;
            }
        }
        return min;
    }
}