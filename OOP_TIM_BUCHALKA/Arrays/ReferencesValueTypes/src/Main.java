import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value: " + myIntValue);
        System.out.println("My another int value " + anotherIntValue);
        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;



        int[] newNumber = numbers;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumber));

        newNumber[1] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumber));

    }
}