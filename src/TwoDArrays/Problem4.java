package TwoDArrays;

import java.util.Scanner;

public class Problem4{

    // Function to calculate nCr (binomial coefficient)
    public static int nCr(int n, int r) {
        if (r == 0 || r == n) return 1;
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    // Function to print Pascal's Triangle
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces for formatting
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            // Print values
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nPascal's Triangle:");
        printPascalsTriangle(rows);
    }
}
