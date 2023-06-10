package T2020.SummerA;

public class Q4 {
    public static boolean func (int[] arr){
        if (arr.length < 3 || arr.length %2 == 0)
            return false;

        int t = arr.length / 2;
        int m = arr[t];

        for (int i = 0; i < t; i++) {
            if (arr[i] < m)
                return false;
        }

        for (int i = t + 1; i < arr.length; i++) {
            if (arr[i] > m)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = {22,56,123,12,10,-4,2};
        System.out.println(func(arr));
    }
}

