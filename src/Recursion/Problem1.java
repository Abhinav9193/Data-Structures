package Recursion;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        printIncreasing(n);
    }

    static void printIncreasing(int n)
    {
        if(n == 1)
        {
            System.out.println(1);
            return;
        }
         printIncreasing(n-1);
        System.out.println(n + " ");
    }
}
