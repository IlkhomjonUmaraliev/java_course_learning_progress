class Car {
    private String name;
    private int cylindersCount;
    private int wheels;

    public Car(String name, int cylindersCount) {
        this.name = name;
        this.cylindersCount = cylindersCount;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("honk honk. Shit I am slow. Don't be mad at me :)");
    }

    public void accelerate(int speed) {
        System.out.println("Speed in increased by " + speed);
        System.out.println("It took some time, shit");
    }

    public void brake() {
        System.out.println("We managed to stop and took some time");
    }

    public String getName() {
        return name;
    }

    public int getCylindersCount() {
        return cylindersCount;
    }
}


class Cadillac extends Car{

    public Cadillac() {
        super("Cadillac", 10);
    }

    public void startEngine() {
        System.out.println("voooooooommmmmmmmmm");
    }

    public void accelerate(int speed) {
        System.out.println("Speed in increased by " + speed);
        System.out.println("I am fucking fast my friend");
    }

    public void brake() {
        System.out.println("I stopped on time, my rich friend");
    }
}


public class Main {
    public static void main(String[] args) {
        Car shittyCar = new Car("Shitty", 2);
        shittyCar.accelerate(30);
        shittyCar.brake();
        shittyCar.startEngine();

        Cadillac cadillac = new Cadillac();
        cadillac.getName();
        cadillac.getCylindersCount();

        cadillac.startEngine();
        cadillac.accelerate(1000);
        cadillac.brake();

    }
}