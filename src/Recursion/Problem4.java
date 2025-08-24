package Recursion;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i =0; i< n;i++)
        {
            System.out.println(fibonacci(i));
        }


    }

    static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);
        return prev + prevPrev;
    }

}
