package T2021.SpringA;

public class Q4 {
    public static boolean func(int[] arr) {
        if (arr.length % 2 == 0 || arr[arr.length / 2] != 0)
            return false;
        int m = arr.length / 2;
        for (int i = 0; i < m; i++)
            if (arr[i] > 9)
                return false;
        for (int i = m + 1; i < arr.length; i++)
            if (arr[i] < 10)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 0, 8576, 348, 90};
        System.out.println(func(arr));
    }
}
