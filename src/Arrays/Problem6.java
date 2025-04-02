package Arrays;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a target element: ");
        int target = sc.nextInt();
        int[] arr = {3,4,2,5,6,5,7,8,3,6,8,5,9,3,6};
        int count = 0;
        for (int i=0; i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                count++;
            }
        }
        System.out.println("The number of elements greater than target number are: " + " " + count);
    }

}
