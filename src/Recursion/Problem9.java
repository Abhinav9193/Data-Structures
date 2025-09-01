package Recursion;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the no of multiples: ");
        int k = sc.nextInt();
        multiples(n, k);
    }

    static void multiples(int n, int k) {
        if (k == 0) {
            return;
        }
        multiples(n, k - 1); // recursive call
        System.out.print(n * k + " "); // print each multiple
    }
}

