package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,4,6,5,7,1};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr,target));
    }

    static boolean binarySearch(int[] arr, int target)
    {
        int n = arr.length;
        int start = 0, end = n-1;

        Arrays.sort(arr);

        while (start<end)
        {
            int mid = (start + end)/2;
            if(target == arr[mid])
            {
                return true;
            }

            else if (target<arr[mid])
            {
                end = mid-1;
            }

            else {
                start = mid + 1;
            }
        }

        return false;
    }
}
