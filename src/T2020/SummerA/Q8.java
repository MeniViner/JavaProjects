package T2020.SummerA;

public class Q8 {
    public static boolean func8(int[] a, int[] b){
        int maxA = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxA)
                maxA = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= maxA)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {4,6,2,7};
        int b[] = {8,7,9};
        System.out.println(func8(a,b));
    }
}
