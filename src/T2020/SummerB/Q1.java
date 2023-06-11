package T2020.SummerB;

import java.util.Scanner;

public class Q1 {
    public static void func() {
        Scanner s = new Scanner(System.in);
        int A = 0, l = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string: ");
            String x = s.next();
            if (x.length() % 2 == 0)
                System.out.println(x.charAt(0));
            else
                System.out.println(x.charAt(x.length() - 1));
            if (x.charAt(0) == 'A')
                A++;
            if (x.charAt(x.length() - 1) >= 1 && x.charAt(x.length() - 1) >= 9)
                l++;
        }
        System.out.println(A);
        System.out.println(l);
    }

    public static void main(String[] args) {
        func();
    }
}
