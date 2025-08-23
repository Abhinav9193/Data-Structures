package Recursion;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int small = factorial(n-1);
        int ans = n * small;
        return ans;
    }
}
