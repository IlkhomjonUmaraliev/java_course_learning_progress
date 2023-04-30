// Price of chips is $2.50
// Price of Soda is $1.50

public class DeluxeBurger extends Hamburger{
    private double chips = 2.50;
    private double soda = 1.50;

    public DeluxeBurger() {
        super("Deluxe burger", "Beef");
    }

    public double getChips() {
        return chips;
    }

    public double getSoda() {
        return soda;
    }

    public double getPrice() {
        return super.getPrice() + this.getChips() + this.getSoda();
    }
}
