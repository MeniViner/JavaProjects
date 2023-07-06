package e;

public class q3 {
    public static int lexicographic(String s1, String s2) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < s1.length(); i++)
            sum1 += s1.charAt(i);

        for (int i = 0; i < s2.length(); i++)
            sum2 += s2.charAt(i);

        return sum1 > sum2 ? 1 : 2;
    }
}
