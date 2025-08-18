package TwoDArrays;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix1(arr1, r1, c1);

        System.out.println("Matrix 2:");
        printMatrix2(arr2, r2, c2);

        System.out.println("Multiplication of matrices is:");
        multiplicationOfMatrices(arr1, r1, c1, arr2, r2, c2);

        sc.close();
    }

    static void printMatrix1(int[][] arr1, int r1, int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printMatrix2(int[][] arr2, int r2, int c2) {
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplicationOfMatrices(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Oops! Multiplication not possible (Wrong Dimensions)");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print the result matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
