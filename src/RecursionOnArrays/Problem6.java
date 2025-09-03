package RecursionOnArrays;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,4,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int idx = sc.nextInt();
        System.out.println("Enter the target value: ");
        int n = sc.nextInt();
        System.out.print("The value is present at indices: ");
        LSearch(arr,n,idx);
    }

    static int LSearch(int[] arr, int n, int idx)
    {
        if(idx>=arr.length)
        {
            return -1;
        }

        if(arr[idx] == n)
        {
            System.out.print(idx + "," + " ");
        }
        return LSearch(arr,n,idx+1);
    }
}
