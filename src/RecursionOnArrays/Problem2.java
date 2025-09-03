package RecursionOnArrays;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {5,15,7,18,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int idx = sc.nextInt();

        System.out.println("The maximum element in the array is: " + maxInArray(arr,idx));
    }

    static int maxInArray(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }

        int ans = maxInArray(arr,idx+1);
        return Math.max(ans,arr[idx]);
    }
}
