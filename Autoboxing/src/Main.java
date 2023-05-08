import java.util.ArrayList;

/**
 * Created by dev on 6/05/2023
 */

class IntClass {
    private int number;

    public IntClass(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> values = new ArrayList<>(); // Here we have used Integer class to store int values
        // in ArrayList because ArrayList can only hold Object values

        ArrayList<IntClass> myNumbers = new ArrayList<>();
        myNumbers.add(new IntClass(123));
        myNumbers.add(new IntClass(564));
        myNumbers.add(new IntClass(932));


        for(IntClass num : myNumbers) {
            System.out.println(num.getNumber());
        }
    }
}