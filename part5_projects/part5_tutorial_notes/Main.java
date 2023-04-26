/**
 * Created by Dev on 26/04/2023
 */
public class Main {
    public static void main(String[] args) {
//        int number = 5;
//        call(number);
//        System.out.println("Number is still " + number);


//    public static void call(int number) {
//        //The method Call gets the copy of the primitive data type int
//        //and changes that primitive data type
//        System.out.println("Number is still " + number);
//        number += 1;
//        System.out.println("Number is now " + number);
//    }

          Riders rider = new Riders(169);

          Attraction rollerCoater = new Attraction();

        System.out.println(rollerCoater.allowedToRide(rider));
    }

}
