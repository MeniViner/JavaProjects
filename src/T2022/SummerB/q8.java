package T2022.SummerB;

public class q8 {
    public static boolean special(String str) {
        if (str == "")
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' && str.charAt(i) > 'z' || str.charAt(i) < 'A' && str.charAt(i) > 'Z')
                return false;

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
