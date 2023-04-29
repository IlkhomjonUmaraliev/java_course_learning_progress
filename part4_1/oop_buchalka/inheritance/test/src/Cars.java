public class Cars {
    private String model;
    private int maxSpeed;

    public Cars(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public boolean isFaster(Cars secondCar) {
        return this.maxSpeed > secondCar.maxSpeed;
    }
}
