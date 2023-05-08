import java.util.ArrayList;

public class AmusementPark {
    private String name;
    private int minimumHeight;
    private int minimumAge;
    private int visitors;
    private ArrayList<Person> visitorsRiding;

    public AmusementPark(String name,  ArrayList<Person> visitorsRiding) {
        this.name = name;
        this.minimumHeight = 160;
        this.minimumAge = 14;
        this.visitors = 0;
        this.visitorsRiding = new ArrayList<>();
    }

    public boolean isEligibleToRide(Person person) {
        if(person.getAge() >= this.minimumAge && person.getHeight() >= this.minimumHeight) {
            visitorsRiding.add(new Person(person.getName(), person.getHeight(), person.getAge()));
            visitors++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getMinimumHeight() {
        return minimumHeight;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getVisitors() {
        return visitors;
    }

    public ArrayList<Person> getVisitorsRiding() {
        return visitorsRiding;
    }

    public String toString() {
        return "Name of the attraction: " + this.getName() + " Minimum height required: " + this.getMinimumHeight()  +
                " Minimum age: " + this.getMinimumAge() + " Visitors count: " + this.getVisitors();
    }
}
