/**
 * Created by Dev on 25.04.2023
 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog bulldog = new Dog("Qoplon", 2, 3, 2, 4, 1, 24, "Grey" );
        bulldog.eat();
        bulldog.move();


        Ferrari ferrari = new Ferrari("Ferrari", 2023, 100000, "Sports Car", "Ilkhom");
        System.out.println(ferrari);

        Fish goldfish = new Fish("Fish", 1, 1, 3, 40, 2, 2, 14);
        goldfish.eat();
    }
}