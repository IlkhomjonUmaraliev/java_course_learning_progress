public class Contacts {
    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }



    public boolean searchContact(String name) {
        return this.name.equalsIgnoreCase(name);
    }


    public void updateExistingContact(String name, String number) {
        this.name = name;
        this.number = number;
    }


    public String toString() {
        return this.name + " " + this.number;
    }
}
