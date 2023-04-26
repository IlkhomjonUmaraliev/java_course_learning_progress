/**
 * Created by dev on 26/04/2023
 */


public class Ferrari extends Car{
    private String type;
    private String driver;
    public Ferrari(String model, int year, int priceOfCar, String type, String driver) {
        super(model, year, priceOfCar);
        this.type = type;
        this.driver = driver;
    }

    public String getType() {
        return type;
    }

    public String getDriver() {
        return driver;
    }

    public String toString() {
        return "Model: " + this.getModel() + " Year: " + this.getYear() + " Price: " + this.getPriceOfCar() + " Type: " + this.getType() +
                " Driver: " + this.getDriver();
    }
}
