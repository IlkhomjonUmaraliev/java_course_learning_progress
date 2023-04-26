public class Car extends Vehicle{

    private int doors;
    private int wheels;
    private int maxSpeed;
    private int currentGear;
    public Car(String type, int doors, int wheels, int maxSpeed) {
        super(type);

        this.doors = doors;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.currentGear = 0;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void steer(String direction) {
        System.out.println("Steering " + this.getType() + " on " + direction);
    }

    public void increaseGear() {
        if(this.currentGear < 5) {
            this.currentGear = this.currentGear + 1;
        }
    }

    public void decreaseGear() {
        if(this.currentGear > 1) {
            this.currentGear = this.currentGear - 1;
        }
    }
}
