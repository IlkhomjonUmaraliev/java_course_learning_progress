public class Ferrari extends Car{
    private String plateNumber;
    private String driver;

    public Ferrari(String type, int doors, int wheels, int maxSpeed, String plateNumber, String driver) {
        super(type, doors, wheels, maxSpeed);
        this.plateNumber = plateNumber;
        this.driver = driver;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getDriver() {
        return driver;
    }

    public String toString() {
        return "Type: " + this.getType() + " Doors: " + this.getDoors() + " Wheels: " + this.getMaxSpeed() + " Plate Number: " +
                this.getPlateNumber() + " Driver: " + this.getDriver();
    }

    @Override
    public void move() {
        System.out.println(this.getType() + " is moving");
    }
}
