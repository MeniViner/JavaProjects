package e.trackingTables;

public class q5 {
    public static int Mystery(int arr[]) {
        int a=arr[0], b=arr[arr.length-1];
        for(int i=0,j=arr.length-1; i<j;i++,j--){
            if(arr[i]%2==0 && arr[i]>a)
                a=arr[i];
            if(arr[j]%2==1 && arr[j]<b)
                b=arr[i];
        }
        return Math.abs (a-b);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,4,5,9};
        System.out.println(Mystery(arr));
    }

}

/*

א.
| a | b |  i  |  j  | i[arr] | j[arr] | if1 | if2 |
|---|---|-----|-----|--------|--------|-----|-----|
| 2 | 9 |  -  |  -  |   -    |   -    |  -  |  -  |
| - | - |  0  |  7  |   2    |   9    |  f  |  f  |
| - | 5 |  1  |  6  |   3    |   5    |  f  |  t  |
| 4 | - |  2  |  5  |   4    |   4    |  t  |  f  |
| - | - |  3  |  4  |   5    |   9    |  f  |  f  |
| - | - |  4  |  3  |   9    |   5    |  f  |  f  |
| - | - |  5  |  2  |   4    |   4    |  f  |  f  |
| - | 3 |  6  |  1  |   5    |   3    |  t  |  f  |
| - | - |  7  |  0  |   9    |   2    |  f  |  f  |
output: 1

ב.
The function will return the absolute value of the smallest odd number in the array minus the largest even number in the array.

ג.
for example {9,2,7,4} -> 2-7 = -5

*/

