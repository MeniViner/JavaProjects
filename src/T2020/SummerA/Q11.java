package T2020.SummerA;

public class Q11 {
    public static void arrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0)
                left++;
            else if (arr[right] % 2 != 0)
                right--;
            else
            {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                System.out.print("{");
            System.out.print(arr[i]);
            if (i < arr.length-1)
                System.out.print(",");
            if (i == arr.length-1)
                System.out.print("}");
        }
    }

    public static void order(int[] arr) {
        int[] temp = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                temp[k++] = arr[i];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0)
                temp[k++] = arr[i];
        for (int i = 0; i < arr.length; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {123,45,678,12,345};
        arrange(arr);
        System.out.println();
        int[] brr = {12,55,34,46,67};
        order(brr);
    }
}
