package T2020.SummerB;

public class Q10 {
    public static int dist(int[] arr, int num) {
        int count = 0;
        boolean flag = true;
        for (int i : arr) {
            if (i == num) {
                flag = false;
                break;
            }
            count++;
        }
        int minDistance = count;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == num)
                break;
            count++;
        }
        if (!flag)
            return Math.min(minDistance, count);
        else
            return -1;
    }

    public static int minNum(int[] arr) {
        int minDistance = Integer.MAX_VALUE;
        int minNum = arr[0];
        for (int i : arr) {
            int distance = dist(arr, i);
            if (distance != -1 && distance < minDistance) {
                minDistance = distance;
                minNum = i;
            }
        }
        return minNum;
    }


    public static void main(String[] args) {
        int[] arr = {4, 10, 13, 71, 10, 10, 71, 71, 2, 10};
        int dist1F = dist(arr, 71);
        int dist1S = dist(arr, 13);
        int dist2 = minNum(arr);

        System.out.println("1) 71: " + dist1F + ", 13: " + dist1S);
        System.out.println("2) " + dist2);
    }
}
