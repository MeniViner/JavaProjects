package T2020.SummerB;

public class Q11 {
    public static boolean secret(int n1, int n2) {
        if (n1 < 10)
            return (n1 == n2);
        if (n1 % 10 == n2)
            return true;
        return secret(n1 / 10, n2);
    }

    public static int[] bigSecret(int[] arr) {
        int[] temp = new int[arr.length];
        mystery(arr, temp, 0, 0, temp.length - 1);
        return temp;
    }

    private static void mystery(int[] arr, int[] temp, int k, int low, int high) {
        if (k < arr.length) {
            if (secret(arr[k] / 10, arr[k] % 10)) {
                temp[high] = arr[k];
                mystery(arr, temp, k + 1, low, high - 1);
            } else {
                temp[low] = arr[k];
                mystery(arr, temp, k + 1, low + 1, high);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(secret(528, 5));
        int[] arr = {424, 57547, 130, 57675, 12};
        int[] f = bigSecret(arr);
        for (int i = 0; i < f.length - 1; i++)
            System.out.print(f[i] + ",");
    }
}