import java.util.Scanner;
import java.util.Arrays;
public class TimsVersion {
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
        int lastValue = arr.length - 1;
        // To get the index of the last value in the given arr;
        int middle = lastValue / 2;
        // middle is required for our loop; when we loop through half of the array
        // it means we swapped all the items in the array; without middle we swap all
        // items and put them back to their original position
        for(int i = 0; i < middle; i++) {
            int temp = arr[i];
            arr[i] = arr[lastValue - i];
            // On the first loop i=0; arr[lastValue - i] == lastValue - 1;
            // arr[0] = first element; arr[lastValue - 0]
            arr[lastValue - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
