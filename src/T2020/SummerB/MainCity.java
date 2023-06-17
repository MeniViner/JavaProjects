package T2020.SummerB;

import java.util.Scanner;

public class MainCity {
    public static void func() {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int people = 0, branch = 0, counter = 0;
        boolean flag = true;
        while (flag) {
            if (name == "Stop") {
                flag = false;
                break;
            }
            people = s.nextInt();
            branch = s.nextInt();
            if (branch > 4 && people > 5000) {
                City city = new City(name, people, branch);
                System.out.println(city.getName() + city.isFit());
                if (!city.isFit())
                    counter++;
            }
        }
        System.out.println("numbers of city's that didn't fit's the poll:" + counter);
    }

    public static void main(String[] args) {
        func();
    }
}
