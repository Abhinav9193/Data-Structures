package TwoDArrays;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter the number of elements: ");
        for (int i =0; i<r;i++)
        {
            for(int j =0; j<arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is: ");
        for (int i = 0;i<r;i++)
        {
            for (int j =0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
