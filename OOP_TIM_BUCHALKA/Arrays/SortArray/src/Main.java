import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program wil create an array for you" +
                "and sort it in a descending order");

        int count;

        while(true) {
            System.out.println("Please enter the number of values you want to insert");
            count = scanner.nextInt();
            if(count > 0) {
                break;
            }
        }

        int[] myArr = new int[count];

        for(int i = 0; i < myArr.length; i++) {
            System.out.println("Please enter " + (i + 1) + "th number");
            int currentNumber = scanner.nextInt();
            myArr[i] = currentNumber;
        }
        getInput(myArr);
        System.out.println("*******************************");
        System.out.println(Arrays.toString(sortArray(myArr)));

    }

    public static void getInput(int[] arr) {
        for (int j : arr) {
            System.out.println("You entered " + j);
        }
    }

    public static int[] sortArray(int[] arr) {
        int[] reverseArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < reverseArr.length - 1; i++) {
                if(reverseArr[i] < reverseArr[i+1]) {
                    temp = reverseArr[i];
                    reverseArr[i] = reverseArr[i+1];
                    reverseArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return reverseArr;
    }
}