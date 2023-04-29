public class Room {
    private Furniture furniture;

    public Room(Furniture furniture) {
        this.furniture = furniture;
    }

    public void countTypesOfFurniture() {
        System.out.println("Well there are lots of furniture in this room");
        showSize();
    }

    private void showSize() {
        System.out.println(furniture.getFurnitureDetails().getSize().showStandardSize());
    }
}
