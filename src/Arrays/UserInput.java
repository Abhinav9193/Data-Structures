package Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n +  " elements: ");
        for (int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
