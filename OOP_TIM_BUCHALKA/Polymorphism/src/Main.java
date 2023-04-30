/**
 * Created by Dev on 30/04/2023
 */
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Whiplash extends Movie{
    public Whiplash() {
        super("Whiplash");
    }

    public String plot() {
        return "Young Andrew wants to be a drummer";
    }
}



public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Anna");
        System.out.println(movie.plot());



        Whiplash whiplash = new Whiplash();
        System.out.println(whiplash.plot());
    }
}