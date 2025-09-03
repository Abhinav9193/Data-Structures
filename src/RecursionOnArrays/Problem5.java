package RecursionOnArrays;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,5,7,3,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int idx = sc.nextInt();
        System.out.println("Enter the target value: ");
        int n = sc.nextInt();

        System.out.println("The value is present at index: " + LSearch(arr,n,idx));
    }

    static int LSearch(int[] arr, int n, int idx)
    {
        if(idx>=arr.length)
        {
            return -1;
        }

        if(arr[idx] == n)
        {
            return idx;
        }
        return LSearch(arr,n,idx+1);
    }
}
