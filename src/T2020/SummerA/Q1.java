package T2020.SummerA;

import java.util.Scanner;

public class Q1 {
    public static void func() {
        Scanner s = new Scanner(System.in);
        int c = 0, num = 0, cOdd = 0, sumOdd = 0;

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            num = s.nextInt();
            if (num == 0) {
                System.out.println("===============================");
                break;
            }

            c++;

            if (num % 2 == 0) {
                cOdd++;
                sumOdd += num;
            }
        }

        System.out.println("Total numbers entered: " + c);
        double avg = (double) sumOdd / cOdd;
        System.out.println("Average of even numbers: " + avg);
    }

    public static void main(String[] args) {
        func();
    }
}
