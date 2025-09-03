package RecursionOnArrays;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int idx = sc.nextInt();

        System.out.println("The sum of elements is: " + sumOfElements(arr,idx));
    }

    static int sumOfElements(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }

        int ans = sumOfElements(arr,idx+1);
        return ans+arr[idx];
    }
}
