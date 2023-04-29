public class Main {
    public static void main(String[] args) {
        Person ali = new Person("Ali", 2001, 10, 3);
        Person aziza = new Person("Aziza", 2001, 9, 30);

        System.out.println(ali.isOlderThan(aziza));

        Products toothpaste = new Products("Toothpaste", 30000);
        Products toothBrush = new Products("Toothbrush", 100000);

        toothpaste.compareProducts(toothBrush);

        Cars ferrari = new Cars("Ferrari", 240);
        Cars jiguli = new Cars("Jiguli", 200);

        System.out.println(ferrari.isFaster(jiguli));
    }
}