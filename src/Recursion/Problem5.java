package Recursion;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(function(n));
    }

    static int function(int n)
    {
        if(n < 10)
        {
            return n;
        }

        int a = function(n/10);
        int b = n%10;
        return a+b;
    }
}
