package T2022.SummerA;

public class q11 {

    public static int[] buildK(int[] a, int k) {
        int[] n = new int[a.length * k];
        for (int i : n)
            for (int j = i; j < k; j++)
                n[i] = a[j];
        return n;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int multiplyBy = 3;
        int[] n = buildK(arr, multiplyBy);
        for (int i : n)
            System.out.print(n[i] + ",");
    }
}
