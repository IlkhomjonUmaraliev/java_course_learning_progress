/**
 * Created by dev on 26/04/2023
 */

public class Car {
    private String model;
    private int year;
    private int priceOfCar;


    public Car(String model, int year, int priceOfCar) {
        this.model = model;
        this.year = year;
        this.priceOfCar = priceOfCar;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPriceOfCar() {
        return priceOfCar;
    }

    public String toString() {
        return "Model: " + this.getModel() + " Year: " + this.getYear() + " Price: " + this.getPriceOfCar();
    }
}
