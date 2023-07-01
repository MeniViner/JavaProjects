package T2022.SummerB.q12;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public boolean isAvailable(int code) {
        for (int i = 0; i < books.length; i++)
            if (books[i].getCode() == code)
                if (books[i].getNumOfCopies() > 0) {
                    books[i].setNumOfCopies(books[i].getNumOfCopies() - 1);
                    return true;
                }
        return false;
    }

    public void printFits(String genre, double minRate) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getGenre().equals(genre))
                if (books[i].calcRating() >= minRate)
                    System.out.println(books[i].getName());
        }
    }
}
