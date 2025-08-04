package Leetcode;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {

        //User Input in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for(int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Main logic of the question
        System.out.println("Enter the target value: ");
        int val = sc.nextInt();

        for(int i = n-1 ;i>=0; i++)
        {
            if(arr[i] == val)
            {
                System.out.println("The last occurrence of the target value is: " + i);
                break;
            }
        }
    }
}
