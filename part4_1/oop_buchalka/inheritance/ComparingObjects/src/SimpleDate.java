public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public SimpleDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    // if the variables are located in the same position, they are equal
    //By default, "EQUALS" is used to Compare objects
    //So here we are passing an object as a parameter it
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        // IF COMPARED IS NOT A INSTANCE OF SIMPLEDATE
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        if (this.day == comparedSimpleDate.day && this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year) {
            return true;
        }
        return false;
    }


    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
