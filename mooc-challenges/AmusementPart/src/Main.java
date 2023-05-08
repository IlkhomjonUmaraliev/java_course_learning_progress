import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person laziza = new Person("Laziza", 159, 20);
        Person mokhinur = new Person("Mokhinur", 165, 20);
        Person sevara = new Person("Sevara", 180, 21);
        ArrayList<Person> people = new ArrayList<>();
        AmusementPark happyEnding = new AmusementPark("Happy Ending", people);
        happyEnding.isEligibleToRide(laziza);
        happyEnding.isEligibleToRide(mokhinur);
        happyEnding.isEligibleToRide(sevara);
        System.out.println(happyEnding.getVisitors());

        System.out.println(Arrays.toString(happyEnding.getVisitorsRiding().toArray(new Person[0])));

    }
}