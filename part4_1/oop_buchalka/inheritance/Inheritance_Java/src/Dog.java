public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //Inherited the fields from Animal Class
    //Dog class inherited fields form Super(Animal)
    //However we can modify the inherited fields
    //according to the current class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog chews its food");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }
}
