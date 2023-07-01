package T2022.SummerB.q12;

public class Book {
    private int code;
    private String name;
    private String genre;
    private int numOfCopies;
    private int[] rating;

    public Book(int code, String name, String genre, int numOfCopies) {
        this.code = code;
        this.name = name;
        this.genre = genre;
        this.numOfCopies = numOfCopies;
        this.rating = new int[5];
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }

    public void updateRating(int rate) {
        rating[rate++] = rate;
    }

    public double calcRating() {
        double sum = 0;
        for (int i = 0; i < rating.length; i++)
            sum += rating[i];
        return sum / rating.length;
    }
}
