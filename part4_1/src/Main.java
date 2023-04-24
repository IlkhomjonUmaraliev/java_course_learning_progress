/**
 * Created by dev on 23/04/2023
 */
public class Main {
    public static void main(String[] args) {

        /*  Account Class

        James james = new James();
        james.setBalance(1000);
        james.setUser("James");

        james.showInfo();

        james.withdraw(900);


        */


//        Streaming blankSpace = new Streaming("Taylor Swift", "Blank Space");
//        blankSpace.getString();
          /**
          *  CAR CLASS
          */

//        Car fordMustang = new Car();
//        Car corolla = new Car();
//        corolla.setModel("Corolla");
//        System.out.println(corolla.getModel());
//
//        fordMustang.setModel("Mustang Ford");
//        System.out.println(fordMustang.getModel());

          /**
            * ACCOUNT CLASS
           */

//          Account anna = new Account(20, 1000, "Anna Walter",
//                  "annawalter@gmail.com", 12345);
//
//          anna.showInfo();
//
//          anna.withdraw(100);
//
//          anna.showInfo();
//
//          Account noName = new Account();
//
//          noName.showInfo();


//        NEW ACCOUNT


//          Account michael = new Account(12, 1000, "Michael");
//          michael.showInfo();

          // VIP CUSTOMER

        VipCustomer laziza = new VipCustomer();
        laziza.showInfo();

        VipCustomer mohinur = new VipCustomer("Mokhinur", 1000);
        mohinur.showInfo();

        VipCustomer sevara = new VipCustomer("Sevara", 100000, "sevara@gmail.com");
        sevara.showInfo();
    }
}