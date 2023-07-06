package e;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //q1
        int[] arrQ2 = {4,2,4,3,9,5,7};
        System.out.println("//q1\n" + Arrays.toString(arrQ2) + ": " + q1.chatichi(arrQ2));
        //q2
        int fNumQ2 = 222;
        int sNumQ2 = 274;
        System.out.println("\n//q2\n" + fNumQ2 + ": " + q2.chatichAl(fNumQ2) + "\n" + sNumQ2 + ": " + q2.chatichAl(sNumQ2));
        //q3
        String s1q3 = "hello";
        String s2q3 = "hi";
        System.out.println("\n//q3\nBigger: " + q3.lexicographic(s1q3,s2q3));
        //q4


    }
}
