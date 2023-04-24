import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        System.out.println("This program is the console version of library." +
                "In order use it, first you should create a list of books which represents" +
                "books in the library and then you can borrow books or return books");

        ArrayList<Books> library = new ArrayList<>();


        while(true) {
            System.out.println("***************************************");
            System.out.println("Welcome to our virtual library. Please choose the process you want try! \n" +
                    "Write 'add' for adding books to library \n" +
                    "Write 'borrow' for borrowing books \n" +
                    "Write 'return' for returning books \n" +
                    "Write 'list' to see all the books available \n" +
                    "Write 'stop' for stopping the application");
            String userResponse = scanner.nextLine();
            /**
             * ADD BOOKS
             */
            if(userResponse.equalsIgnoreCase("add")) {

                while(true) {
                    boolean canBeAdded = true;
                    System.out.println("Please enter the name of the book");
                    String nameOfTheBook = scanner.nextLine();
                    String nameOfTheAuthor;

                    if(nameOfTheBook.equalsIgnoreCase("stop")) {
                        canBeAdded = false;
                        break;
                    } else {
                        System.out.println("Please enter the author of the book");
                        nameOfTheAuthor = scanner.nextLine();
                    }

                    if(nameOfTheAuthor.equalsIgnoreCase("stop")) {
                        canBeAdded = false;
                        break;
                    }

                    if(canBeAdded) {
                        library.add(new Books(nameOfTheBook, nameOfTheAuthor));
                        System.out.println("Book added to the library");
                    }

                }
            }

            /**
             * BORROW BOOKS
             */

            if(userResponse.equalsIgnoreCase("borrow")) {
                boolean isFound = false;
                while(true) {
                    System.out.println("Please enter the name of the book");
                    String nameOfTheBook = scanner.nextLine();
                    String bookForBorrow;
                    int indexOfBook;

                    if(nameOfTheBook.equalsIgnoreCase("stop")) break;
                    for (Books book : library) {
                        if(book.getNameOfTheBook().equalsIgnoreCase(nameOfTheBook)) {
                            isFound = true;
                            bookForBorrow = book.getNameOfTheBook();
                            indexOfBook = library.indexOf(book);
                            System.out.println("Do you want to borrow " + nameOfTheBook + " yes/no ");
                            String borrowOrNot = scanner.nextLine();

                            if(library.get(indexOfBook).isBookAvailableToBorrow(bookForBorrow)) {
                                if(borrowOrNot.equalsIgnoreCase("yes")) {
                                    library.get(indexOfBook).borrowBook(bookForBorrow);
                                    System.out.println("You borrowed " + bookForBorrow + " on " + dtf.format(now));
                                }
                            } else {
                                System.out.println("Another reader is reading that book");
                            }

                        }
                    }
                        if(!isFound) {
                            System.out.println(nameOfTheBook + " does not exist in our library :(");
                            break;
                        }

                }

            }
            /**
             * BORROW BOOKS
             */



            if(userResponse.equalsIgnoreCase("return")) {
                boolean isFound = false;
                while(true) {
                    System.out.println("Please enter the name of the book you want to return");
                    String nameOfTheBook = scanner.nextLine();
                    String bookForBorrow;
                    int indexOfBook;

                    if(nameOfTheBook.equalsIgnoreCase("stop")) {
                        break;
                    }

                    for(Books book : library) {
                        if(book.getNameOfTheBook().equalsIgnoreCase(nameOfTheBook)) {
                            isFound = true;
                            bookForBorrow = book.getNameOfTheBook();
                            indexOfBook = library.indexOf(book);
                            library.get(indexOfBook).returnBook(bookForBorrow);
                        }

                    }

                    if(!isFound) {
                        System.out.println(nameOfTheBook + " does not exist in our library :(");
                        break;
                    }

                }
            }

            if(userResponse.equalsIgnoreCase("list")) {
                for(Books book : library) {
                    System.out.println(book.getNameOfTheBook() + " by " + book.getAuthorOfTheBook());
                }
            }





            if(userResponse.isBlank()) {
                break;
            }

            if(userResponse.equalsIgnoreCase("stop")) {
                break;
            }

        }


    }

}