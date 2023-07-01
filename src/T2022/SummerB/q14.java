package T2022.SummerB;

public class q14 {
    public static int numValues(int[][] mat, int col, int value) {
        int countValues = 0;

        for (int i = 0; i < mat.length; i++)
            if (mat[i][col] == value)
                countValues++;

        return countValues;
    }

    public static boolean isPair(int[][] mat, int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (i != numValues(mat, i, arr[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 4, 15};
        int[][] mat = {
                {3, 8, 10, 1},
                {4, 12, 10, 15},
                {11, 6, 4, 14},
                {19, 1, 4, 15},
                {2, 2, 12, 15},
                {1, 1, 14, 4}
        };

        System.out.println(isPair(mat, arr));
    }
}
