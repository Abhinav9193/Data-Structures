package Recursion;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of series is: " + SumOfSeries(n));
    }

    static int SumOfSeries(int n)
    {
        if(n == 0)
        {
            return n;
        }

        if (n%2== 0)
        {
            return SumOfSeries(n-1)-n;
        }
        return SumOfSeries(n-1)+n;
    }
}
