public class Books {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private boolean isAvailable;

    public Books(String nameOfTheBook, String authorOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.isAvailable = true;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }



    public boolean isBookAvailableToBorrow(String nameOfTheBook) {
        if(this.isAvailable) {
            return true;
        } else {
            return false;
        }
    }

    public void borrowBook(String nameOfTheBook) {
        if(isBookAvailableToBorrow(nameOfTheBook)) {
            System.out.println("You have borrowed the book! Enjoy :)");
            this.isAvailable = false;
        }
    }

    public void returnBook(String nameOfTheBook) {
        if(isBookAvailableToBorrow(nameOfTheBook)) {
            System.out.println("This book is already at our library. You cannot return it!");
        } else {
            this.isAvailable = true;
            System.out.println("Thank you for using our library!");
        }
    }
}
