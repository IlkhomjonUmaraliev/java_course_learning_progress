public class Main {
    public static void main(String[] args) {
        Hamburger baseHamburger = new Hamburger("Typical Bread", "Beef");
        System.out.println(baseHamburger.getPrice());
        baseHamburger.addCarrot();
        baseHamburger.addLettuce();
        baseHamburger.addPickle();
        baseHamburger.addTomato();
        System.out.println(baseHamburger.getPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getPrice());

        deluxeBurger.addCarrot();
        deluxeBurger.addLettuce();

        System.out.println(deluxeBurger.getPrice());
    }
}