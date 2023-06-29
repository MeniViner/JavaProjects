package T2022.SummerB;

public class q3 {
    public static boolean isPeak(int[] arr, int index) {
        if (index == 0 || index == arr.length - 1)
            return false;
        if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1])
            return true;
        return false;
    }

    public static int countIndex(int[] arr) {
        int x = 0;
        for (int i = 1; i < arr.length - 1; i++)
            if (isPeak(arr, i))
                x++;
        return x;
    }

    public static void main(String[] args) {
        int[] array = {7, 10, 6, 15, 9, 3};
        System.out.println("Number of peaks in array are: " + countIndex(array));
        System.out.print("🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶🥶");
    }
}
