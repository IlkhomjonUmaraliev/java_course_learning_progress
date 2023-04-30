// Price of base hamburger is $2.00
// Price of Lettuce is $0.10
// Price of Tomato is $0.05;
// Price of Carrot is $0.20
// Price of Pickle is $0.15

public class Hamburger {
    private String breadRollType;
    private String meatType;
    private boolean hasLettuce = false;
    private boolean hasTomato = false;
    private boolean hasCarrot = false;
    private boolean hasPickle = false;
    private double price = 2.00;
    public Hamburger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;

    }

    public void addLettuce() {
        this.hasLettuce = true;
        this.price = this.price + 0.10;
        System.out.println("Lettuce has been added to Hamburger");
    }

    public void addTomato() {
        this.hasTomato = true;
        this.price = this.price + 0.05;
        System.out.println("Tomato has been added to Hamburger");
    }

    public void addCarrot() {
        this.hasCarrot = true;
        this.price = this.price + 0.20;
        System.out.println("Carrot has been added to Hamburger");
    }

    public void addPickle() {
        this.hasPickle = true;
        this.price = this.price + 0.15;
        System.out.println("Pickle has been added to Hamburger");
    }

    public double getPrice() {
        return price;
    }


}
