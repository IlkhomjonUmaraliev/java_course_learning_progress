/**
 * Created by dev 29/04/2023
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 40, 30);
        Case newCase = new Case("SuperX", "Asus", "AsusPower", dimensions);

        Monitor monitor = new Monitor("27 INCH", "LG", 27, new Resolution(20, 40));
        Motherboard motherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(newCase, monitor, motherBoard);
        // thePc.getMonitor().drewPixelAt(3, 10, "Red");
        thePc.powerUp();

        System.out.println("*****************************");

        Size size = new Size();
        FurnitureDetails details = new FurnitureDetails("Chair", size);
        Furniture furniture = new Furniture(4, 1, 10, details);
        Room myRoom = new Room(furniture);

        myRoom.countTypesOfFurniture();
    }
}