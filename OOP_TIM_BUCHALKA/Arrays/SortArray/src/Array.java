import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of values you want to insert in an array");
        int count = scanner.nextInt();

        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.println("Please enter " + (i+1) + "th number");
            int current = scanner.nextInt();
            arr[i] = current;
        }

        for(int number : arr) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int[] copyArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }

        boolean flag = true;
        while(flag) {
            flag = false;
            for(int j = 0; j < copyArray.length - 1; j++) {
                int temp;
                if(copyArray[j] < copyArray[j+1]) {
                    temp = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                    flag = true;
                }
            }
        }
        return copyArray;
    }
}
