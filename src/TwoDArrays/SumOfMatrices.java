package TwoDArrays;

import java.util.Scanner;

public class SumOfMatrices {

    static void Sum(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        // check if addition is possible
        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition not possible (dimension mismatch).");
            return;
        }

        int[][] sum = new int[r1][c1];

        // perform addition
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method to take user input for a matrix
    static int[][] userInput(int r, int c, Scanner sc) {
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // matrix 1
        System.out.println("Enter number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns for Matrix 1: ");
        int c1 = sc.nextInt();
        int[][] a = userInput(r1, c1, sc);

        // matrix 2
        System.out.println("Enter number of rows for Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns for Matrix 2: ");
        int c2 = sc.nextInt();
        int[][] b = userInput(r2, c2, sc);

        // add and print
        Sum(a, r1, c1, b, r2, c2);
    }
}
