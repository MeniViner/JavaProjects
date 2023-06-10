package T2020.SummerA;
public class Q9 {
    public static int[] secret(char[] data) {

        int[] temp = new int[26];

        for (int i = 0; i < temp.length; i++)
            temp[i] = 0;

        for (int k = 0; k < data.length; k++) {
            int ind = (int) data[k] - 65;
            temp[ind]++;
        }

        return temp;
    }
    public static void main(String[] args) {
        char[] let = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //char[] let={'A','F','B','B','F','K','A', 'A','D','F'};
        int[] res = secret(let);

        for (int i = 0; i < res.length; i++)
        {
            int t = res[i];

            if (t > 0) {

                int code = i + 65;
                char ch = (char)code;

                for (int k = 1; k <= t; k++)
                    System.out.print(ch);

                System.out.println();
            }
        }
    }
}

