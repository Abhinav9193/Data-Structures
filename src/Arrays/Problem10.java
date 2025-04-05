package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("The reverse of the array is: ");
        for(int j = arr.length-1; j >=0; j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
