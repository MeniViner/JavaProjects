package T2022.SummerB;

public class q8 {
    public static int[] why(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[count] = arr[i];
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++)
            res[i] = temp[i];
        return res;
    }
}













