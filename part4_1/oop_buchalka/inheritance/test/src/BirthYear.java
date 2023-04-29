

public class BirthYear {
    private int year;
    private int month;
    private int day;

    public BirthYear(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public boolean before(BirthYear compared) {
        if(this.year < compared.year) {
            return true;
        }

        if(this.year > compared.year) {
            return false;
        }

        if(this.month < compared.month) {
            return true;
        }

        if(this.month > compared.month) {
            return false;
        }

        return this.day < compared.day;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
