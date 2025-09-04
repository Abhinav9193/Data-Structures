package RecursionOnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,4,1};
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        System.out.println("Sorted array is: " + Arrays.toString(isSorted(arr,idx)));
    }

    static int[] isSorted(int[] arr, int idx)
    {
        if(idx>=arr.length-1) {
            return arr;
        }

        isSorted(arr,idx+1);

        if(arr[idx]> arr[idx+1])
        {
            int temp = arr[idx];
            arr[idx] = arr[idx+1];
            arr[idx+1] = temp;
            isSorted(arr,idx);
        }
        return arr;
    }
}
