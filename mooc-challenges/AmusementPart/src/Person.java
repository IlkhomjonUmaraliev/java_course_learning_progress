public class Person {
    private String name;
    private int height;
    private int age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person is : " + this.getName() + " " + this.height + " tall and " + this.age + " years old";
    }
}
