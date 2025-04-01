package Arrays;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int[] arr = {3,7,6,8,7,9,4,6,3,2,6,3,6,4};
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
        }

        System.out.println("The number of occurence of this number is: " + count);
    }
}
