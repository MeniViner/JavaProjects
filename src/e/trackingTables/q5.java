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
