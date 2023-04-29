public class Person {
    private String name;
    private BirthYear birthYear;

    public Person(String name, BirthYear birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name, int year, int month, int day) {
        this.name = name;
        this.birthYear = new BirthYear(year, month, day);
    }

    public boolean isOlderThan(Person compared) {
        return this.birthYear.before(compared.birthYear);
    }


    public String toString() {
        return this.name + ", born on " + this.birthYear;
    }
}
