package T2020.SummerB;

public class Jumper {
    private String name;
    private double score;

    public Jumper(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static double avg(Jumper[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getScore();
        }
        return sum / arr.length;
    }

    public static void print(Jumper[] arr) {
        System.out.println("Those who managed to pass the average score were:");
        for (int i = 0; i < arr.length; i++)
            if (arr[i].getScore() > avg(arr))
                System.out.print(arr[i].getName() + " | ");
    }
}
