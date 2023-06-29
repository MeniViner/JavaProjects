package T2021.SpringB;

public class q9 {
    public static int func(int[] arr, int num) {
        int count = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                temp++;
            else if (arr[i] != arr[i + 1])
                temp = 0;
            if (temp == num - 1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 2, 5, 6, 6, 1, 3, 3, 3, 3, 1, 2};
        System.out.println(func(arr, 3));
    }
}
