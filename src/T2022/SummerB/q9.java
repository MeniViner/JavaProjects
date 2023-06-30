package T2022.SummerB;

public class q9 {

    public static boolean isSpecialString(String str) {
        if (str.isEmpty())
            return false;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                long count = str.chars().filter(ch -> ch == c).count();

                if (count % 2 != 0)
                    return false;
            } else if (c >= 'A' && c <= 'Z') {
                long count = str.chars().filter(ch -> ch == c).count();

                if (count % 2 != 0)
                    return false;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSpecialString("xAnnNNOLPPOLNNxA"));
    }
}
