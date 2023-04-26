public class Attraction {
    private int minimumHeight;
    private String name;

    public Attraction() {
        this.minimumHeight = 170;
        this.name = "Roller Coaster";
    }

    public boolean allowedToRide(Riders riders) {
        if(riders.getHeight() < this.minimumHeight) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.name + ", minimum height " + this.minimumHeight;
    }

}
