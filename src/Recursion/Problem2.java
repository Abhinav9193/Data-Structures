package Recursion;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }

    static void printDecreasing(int n)
    {
        if(n == 1)
        {
            System.out.println(1);
            return;
        }

        System.out.print(n + " ");
        printDecreasing(n-1);
    }
}
