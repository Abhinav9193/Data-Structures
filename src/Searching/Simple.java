package Searching;

import java.util.Scanner;
import java.util.Arrays;

public class Simple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.print("Mention the target element: ");
        int target = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            if(arr[i] == target)
            {
                System.out.println(i);
            }
        }


    }
}
