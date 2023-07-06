package e;

public class q2 {
    public static boolean chatichAl(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }

}

