package e.trackingTables;

public class q6 {

    public static int torture (String str, int x){
        int temp = 0;
        if (str.equals(""))
            return x;
        if (str.charAt(0) == '1') {
            temp = (int) Math.pow(2, str.length()-1);
        }
        return torture (str.substring(1), x + temp);
    }

    public static int BinaryConverter(String num) {
        int binary = 0;

        for (int i = 0; i < num.length(); i++)
            if (num.charAt(i) == '1')
                binary += Math.pow(2, num.length()-1 -i);

        return binary;
    }

    public static void main(String[] args) {
        String str = "10100";
        int x = 0;
        System.out.println(torture(str, x));
        System.out.println(BinaryConverter(str));
    }
}
