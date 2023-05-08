import java.util.LinkedList;
import java.util.ListIterator;

public class Strings {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Laziza");
        names.add("Mokhinur");
        names.add("Madina");
        names.add("Sevara");

        printNames(names);
    }

    private static void printNames(LinkedList<String> names) {
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
