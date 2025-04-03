package Leetcode;

import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the target Sum: ");
        int t = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the number of elements: ");
        for (int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int j = 0; j < arr.length; j++)
        {
            for (int k =j+1;k<arr.length;k++)
            {
                for (int l = k+1;l<arr.length;l++)
                {
                    if(arr[l] + arr[k] + arr[j] == t)
                    {
                        System.out.println("The target Sum is achieved between the numbers: " + " " + j + " " + k + " " + l);
                    }
                }
            }

        }
    }
}
