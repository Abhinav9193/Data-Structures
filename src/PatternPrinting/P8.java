package PatternPrinting;

import java.util.Scanner;

public class P8 {

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

        System.out.print("The array is: ");
        for(int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();

        for(int i = 0;i<n; i++)
        {
            if(arr[i] == num)
                System.out.println("The number is present at: " + i);

        }
    }
}
