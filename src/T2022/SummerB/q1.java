package T2022.SummerB;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;

        while (true) {
            System.out.print("Enter a string: ");
            String str = s.next();

            if (str.charAt(0) != 'z' || str.charAt(str.length() - 1) != 'z')
                break;

            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')
                x++;
        }

        System.out.println("Number of strings that start and end with 'x': " + x);
    }
}
