package T2022.SummerA;

public class q9 {
    public static boolean special(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z')
                return false;
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(special("c")); //t
        System.out.println(special("abd")); //t
        System.out.println(special("AB")); //f
        System.out.println(special("abca")); //f
        System.out.println(special("ab*cd")); //f
    }
}