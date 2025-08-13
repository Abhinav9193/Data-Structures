package Arrays;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int count = 0;

        for(int j = 0; j<n;j++)
        {
            if(arr[j] == 0)
            {
                count++;
            }

        }
        System.out.println("The number of 0's are: " + count);


        System.out.println("Final Array is: ");
        for(int k = 0; k < count; k++)
        {
            arr[k] = 0;
            System.out.print(arr[k] + " ");
        }

        for(int l = count; l<n; l++)
        {
            arr[l] = 1;
            System.out.print(arr[l] + " ");
        }
    }
}
