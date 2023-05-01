import java.util.Scanner;

/**
 * Created by dev on 1/05/2023
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;

        while(true) {
            System.out.println("Please enter the number of values you want to add to an array");
            count = scanner.nextInt();
            if(count > 0) {
                break;
            }
        }
        int[] numbersList = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.println("Please enter " + (i+1) + "th value");
            int currentNumber = scanner.nextInt();
            numbersList[i] = currentNumber;
        }

        calcSumAverage(numbersList);
    }

    public static void calcSumAverage(int[] arr) {
        int sum = 0;
        double average;
        for (int j : arr) {
            sum = sum + j;
        }
        average = (double) sum / arr.length;
        System.out.println("Sum of all numbers in the array is " + sum);
        System.out.println("The average of all numbers in the array is " + average);
    }
}