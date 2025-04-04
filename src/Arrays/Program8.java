package Arrays;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr.length ; i++)
        {
           arr[i] = sc.nextInt();
        }

        System.out.print("The Array is: ");
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int j =0; j<arr.length;j++)
        {
            for (int k = j+1; k < arr.length; k++)
            {
                if(arr[j] == arr[k])
                {
                    arr[j] = -1;
                    arr[k] = -1;
                }
            }
        }

        for (int j=0; j<arr.length;j++)
        {
            if(arr[j]>0)
            {
                int ans = arr[j];
                System.out.println("The Unique number is : " + ans);
            }
        }
    }
}
