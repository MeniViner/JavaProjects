package e;

public class q1 {
    public static boolean chatichi(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            if (i % 2 != 0)
                for (int j = 2; j < ((arr[i])/2); j++)
                    if (arr[i] % j != 0)
                        return false;

        for (int i = 1; i < arr.length - 1; i++)
            if ((arr[i-1] + arr[i+1]) != arr[i])
                return false;

        return true;
    }

}
