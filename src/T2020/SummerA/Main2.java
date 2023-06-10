package T2020.SummerA;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter flight one:");
        int m1 = s.nextInt();
        int h1 = s.nextInt();
        System.out.println("enter flight two:");
        int m2 = s.nextInt();
        int h2 = s.nextInt();
        Clock2 t1 = new Clock2(h1,m1);
        Clock2 t2 = new Clock2(h2,m2);
        int z1 = t1.getInterval();
        int z2 = t2.getInterval();

        if (z1 < z2)
            System.out.println("flight number one is later.");
        else
            System.out.println("flight number two is later.");
    }
}
