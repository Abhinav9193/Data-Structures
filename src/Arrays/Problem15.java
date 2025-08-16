package Arrays;

import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,3,4,5};
        System.out.println("Write the position for which you want to calculate the prifix sum for: ");
        int n = sc.nextInt();
        int sum = 0;


        for(int i =0; i<=n;i++)
        {
            sum = sum + arr[i];
            arr[n] = sum;
        }

        System.out.println("New Array is: ");
        for(int j =0; j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }

    }
}
