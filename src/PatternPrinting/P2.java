package PatternPrinting;

import java.util.Scanner;

public class P2 {
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

        System.out.println("Enter the number to be checked: ");
        int no = sc.nextInt();

        int count= 0;
        for(int i =0;i < n; i++)
        {
                if(arr[i] == no) {
                    count++;
                }
        }

        if(count == 1)
        {
            System.out.println("Element is unique");
        }
        else
        {
            System.out.println("Element is not unique");
        }
    }
}
