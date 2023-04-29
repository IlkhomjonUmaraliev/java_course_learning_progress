public class Furniture {
    private int chairs;
    private int beds;
    private int electronics;
    private FurnitureDetails furnitureDetails;
    public Furniture(int chairs, int beds, int electronics, FurnitureDetails furnitureDetails) {
        this.chairs = chairs;
        this.beds = beds;
        this.electronics = electronics;
        this.furnitureDetails = furnitureDetails;
    }

    public int getChairs() {
        return chairs;
    }

    public int getBeds() {
        return beds;
    }

    public int getElectronics() {
        return electronics;
    }

    public FurnitureDetails getFurnitureDetails() {
        return furnitureDetails;
    }
}
