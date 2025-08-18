package TwoDArrays;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix 1: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix1(arr, r, c);
        System.out.println("Transposed Matrix: ");
        transposeofMatrix(arr,r,c);
        sc.close();
    }

    static void printMatrix1(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeofMatrix(int[][] arr, int r, int c)
    {
        for (int i =0; i<c; i++)
        {
            for(int j =0; j<r;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

}
