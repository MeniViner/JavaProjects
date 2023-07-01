package T2022.SummerB.q12;

public class Main {
    //main class made with gpt

    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book(1, "To Kill a Mockingbird", "Classic", 2);
        Book book2 = new Book(2, "The Great Gatsby", "Classic", 3);
        Book book3 = new Book(3, "1984", "Science Fiction", 4);
        Book book4 = new Book(4, "The Catcher in the Rye", "Coming-of-Age", 5);

        // Create a library with the books
        Book[] books = {book1, book2, book3, book4};
        Library library = new Library(books);

        // Update ratings and print calculated rating
        int rate1 = 3;
        int rate2 = 4;
        book1.updateRating(rate1);
        book1.updateRating(rate2);
        System.out.println("Calculated rating for " + book1.getName() + ": " + book1.calcRating());

        // Test isAvailable() method
        int code1 = 1;
        int code2 = 3;
        int code3 = 5;
        System.out.println("Availability of book with code " + code1 + ": " + library.isAvailable(code1));
        System.out.println("Availability of book with code " + code2 + ": " + library.isAvailable(code2));
        System.out.println("Availability of book with code " + code3 + ": " + library.isAvailable(code3));

        // Set rating array to length 5 for book1
        int[] ratings = new int[5];
        book1.setRating(ratings);

        // Test printFits() method
        String genre = "Classic";
        double minRating = 4.0;
        System.out.println("Books fitting the criteria (genre: " + genre + ", min rating: " + minRating + "):");
        library.printFits(genre, minRating);
    }
}
