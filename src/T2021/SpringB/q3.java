package T2021.SpringB;

public class q3 {
    public static void print(String s, char ch) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ch) {
                for (int j = i; j < s.length(); j++)
                    System.out.print(s.charAt(j));
                System.out.println();
            }
        System.out.print("=============================");
    }

    public static void main(String[] args) {
        String str = "Java is a good language";
        print(str, 'a');
    }
}
