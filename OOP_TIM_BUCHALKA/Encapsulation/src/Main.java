/**
 * Created by dev on 30/04/2023
 */

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 100;
//        player.weapon = "Knife";
//
//        int damage = 20;
//
//        player.loseHealth(damage);
//
//        System.out.println(player.healthRemaining());

        EnhancedPlayer newPlayer = new EnhancedPlayer("Anna", 200, "Katana");
        System.out.println(newPlayer.getHealth());


        Printer printer = new Printer();
        printer.fillToner(100);
        printer.fillToner(-100);
        System.out.println(printer.getTonerLevel());
        printer.print(30);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());
    }
}