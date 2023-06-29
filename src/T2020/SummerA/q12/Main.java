package T2020.SummerA.q12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String family;
        int num = 0;
        int age = 0;
        do {
            System.out.print("Family name: ");
            family = s.next();
            if (family.equals("STOP"))
                break;
            System.out.print("How many participants will you be? ");
            num = s.nextInt();
            Family f = new Family(family, num, 0);
            for (int i = 0; i < num; i++) {
                System.out.print("How old are you? ");
                age = s.nextInt();
                f.input(age);
            }
            System.out.print("Your total family cost is: " + f.getTotalSum());
            System.out.println("\n====================================");
        } while (family != "STOP");
    }
}
