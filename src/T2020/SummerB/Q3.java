package T2020.SummerB;

public class Q3 {

    public static int what(int a, int b) {
        int c = 0;
        while (a > 0) {
            c = c + b;
            a--;
        }
        return c;
    }

    public static int why(int x, int y) {
        int z = 1;
        while (y > 0) {
            z = what(z, x);
            y--;
        }
        return z;
    }

    public static void main(String[] args) {
        what(4, 3);
        why(4, 3);
    }
}
