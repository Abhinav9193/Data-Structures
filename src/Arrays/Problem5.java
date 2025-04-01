package Arrays;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int[] arr = {2,4,5,6,2,3,4,2,4,5,3,4,6,4,7,6,8,9};
        for (int i=arr.length-1; i>=0;i--)
        {
            if(arr[i] == target)
            {
                System.out.print("The last occure=rence of the target element is: " + i);
                break;
            }
        }
    }
}
