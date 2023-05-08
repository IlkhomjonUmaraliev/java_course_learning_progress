import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by dev on 8/05/2023
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Darwin");
        placesToVisit.add("Adelaide");

        printList(placesToVisit);
        placesToVisit.add(1, "Tashkent");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Zoolander");
        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================");
    }

    public static boolean addInOrder(LinkedList<String> cities, String newCity) {
        ListIterator<String> stringListIterator = cities.listIterator();

        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0) {
                System.out.println("New city is already included " + newCity);
                return false;
            } else if (comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {

            }
            stringListIterator.add(newCity);
        }
        return false;
    }

}
