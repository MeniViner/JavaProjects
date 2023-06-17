package T2020.SummerB;

public class Q9 {
    public static String func(String s) {
        String n = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == ' ')
                n += "." + s.charAt(i + 1);
        return n;
    }
}
