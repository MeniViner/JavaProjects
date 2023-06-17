package T2020.SummerB;

public class Q4 {
    public static boolean func(int[] arr) {
        if (arr.length < 4 || arr.length % 2 != 0)
            return true;
        int l = arr.length;
        int m = (arr.length / 2);
        int sumL = 0, sumR = 0;
        for (int i = 0; i < m; i++)
            sumL += arr[i];
        for (int i = m; i < arr.length; i++)
            sumR += arr[i];
        if (sumR != sumL)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {25, 25, 15, 50, 10, 5};
        System.out.println(func(arr));
    }
}
