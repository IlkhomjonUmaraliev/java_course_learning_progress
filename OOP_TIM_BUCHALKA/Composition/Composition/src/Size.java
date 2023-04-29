public class Size {
    private int height;
    private int weight;

    public Size() {
        this.height = 40;
        this.weight = 40;
    }

    public Size(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String showStandardSize() {
        return "Standard size: --> " + this.height + " by " + this.getWeight();
    }
}
