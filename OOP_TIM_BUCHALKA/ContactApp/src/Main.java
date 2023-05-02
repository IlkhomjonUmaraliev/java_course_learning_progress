import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacts> mobilePhone = new ArrayList<>();

        System.out.println("Welcome to my mobile phone contact application :)");
        printRules();

        boolean flag = true;

        while(flag) {
            System.out.println("Please enter the number of the process");
            try {
                int number = scanner.nextInt();

                switch (number) {
                    case 0 -> {
                        System.out.println("You stopped the program");
                        flag = false;
                    }
                    case 1 -> {
                        if(isContactEmpty(mobilePhone)) {
                            System.out.println("Contact is empty");
                            printRules();
                        } else {
                            System.out.println(mobilePhone);
                        }
                    }
                    case 2 -> {
                        System.out.println("Please enter the name of the contact");
                        scanner.nextLine();
                        String name = scanner.nextLine().toLowerCase();

                        if(doesContactExist(mobilePhone, name)) {
                            System.out.println("Contact already saved on the phone");
                            printRules();
                        } else {
                            System.out.println("Please enter the number");
                            String numberOfUser = scanner.nextLine().toLowerCase();
                            if(isUserInputEmpty(name, numberOfUser)) {
                                System.out.println("Invalid");
                                printRules();
                            } else {
                                mobilePhone.add(new Contacts(name, numberOfUser));
                                System.out.println("Contact added");
                                printRules();
                            }

                        }
                    }
                    case 3 -> {
                        if(isContactEmpty(mobilePhone)) {
                            System.out.println("Empty");

                            break;
                        }

                        System.out.println("Please enter the name of the contact you want to update");
                        scanner.nextLine();
                        String nameOfTheContact = scanner.nextLine().toLowerCase();
                        System.out.println("Please enter the new name of the contact");
                        String newName = scanner.nextLine();
                        System.out.println("Please enter new number");
                        String newNumber = scanner.nextLine().toLowerCase();
                        if(nameOfTheContact.trim().isEmpty() || newNumber.trim().isEmpty()) {
                            System.out.println("Invalid");
                            printRules();
                        } else {
                            for(Contacts contact : mobilePhone) {
                                if(doesContactExist(mobilePhone, nameOfTheContact)) {
                                    contact.updateExistingContact(newName, newNumber);
                                    System.out.println("Contact updated");
                                    printRules();
                                } else {
                                    System.out.println("Can not find the contact");
                                    printRules();
                                    break;
                                }
                            }
                        }
                    } case 4 -> {
                        if(isContactEmpty(mobilePhone)) {
                            System.out.println("Empty");
                            break;
                        }

                        System.out.println("Enter the name of the contact you want to delete");
                        scanner.nextLine();
                        String name = scanner.nextLine().toLowerCase();

                        for(Contacts contact : mobilePhone) {
                            if(doesContactExist(mobilePhone, name)) {
                                mobilePhone.remove(contact);
                                System.out.println("Contact deleted");
                            } else {
                                System.out.println("Contact does not exist");
                            }
                            printRules();
                            break;

                        }
                    } case 5 -> {
                        System.out.println("Please enter the name of the contact");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        findContact(mobilePhone, name);
                        printRules();
                    }default -> System.out.println("Invalid");

                }
            }
            catch (InputMismatchException e) {
                System.out.println("You had to enter an integer value from 0-5");
                System.out.println(e);
                break;
            }

        }

    }

    public static void printRules() {
        System.out.println("""
                 Type 0 to quit\s
                 Type 1 to print list of contacts\s
                 Type 2 to add new contact\s
                 Type 3 to update a contact\s
                 Type 4 to remove a contact\s
                 Type 5 to search and find a contact\
                """);
    }

    public static boolean isContactEmpty(ArrayList<Contacts> contacts) {
        return contacts.size() == 0;
    }

    public static boolean doesContactExist(ArrayList<Contacts> contacts, String name) {
        for(Contacts contact : contacts) {
            if(contact.searchContact(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUserInputEmpty(String name, String number) {
        return name.isEmpty() || number.isEmpty();
    }

    public static void findContact(ArrayList<Contacts> contacts, String name) {
        for(Contacts contact : contacts) {
            if(doesContactExist(contacts, name)) {
                System.out.println(contact);
            } else {
                System.out.println("Could not find the contact");
            }
        }
    }
}