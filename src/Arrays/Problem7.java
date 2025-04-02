package Arrays;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;

        System.out.println("Enter the elements in the array: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: ");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int j = 0; j < arr.length-1; j++)
        {
            for (int k = j+1; k < arr.length; k++)
            {
                if(arr[j]>arr[k])
                {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        System.out.print("the sorted array is: ");
        for (int num: arr)
        {
            System.out.print(num + " ");
        }
    }
}
