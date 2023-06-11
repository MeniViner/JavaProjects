package T2020.SummerB;

public class MainJumper {
    public static void main(String[] args) {
        Jumper[] jumpers = new Jumper[5];

        jumpers[0] = new Jumper("Meni", 7.14);
        jumpers[1] = new Jumper("Alex", 6.01);
        jumpers[2] = new Jumper("Sara", 5.05);
        jumpers[3] = new Jumper("John", 5.10);
        jumpers[4] = new Jumper("Emily", 7.03);

        Jumper.avg(jumpers);
        Jumper.print(jumpers);
    }
}
