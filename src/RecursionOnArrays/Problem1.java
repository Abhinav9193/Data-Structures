package RecursionOnArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        Array(arr,idx);
    }

    static void Array(int[] arr,int idx)
    {
        if(idx == arr.length)
        {
            return;
        }

        System.out.print(arr[idx] + " ");

        Array(arr,idx+1);
    }
}
