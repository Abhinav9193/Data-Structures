package Recursion;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(noOfDigits(n));
    }
    static int noOfDigits(int n)
    {
            n = Math.abs(n);
            if (n < 10) {
                return 1;
            }
            return 1 + noOfDigits(n / 10);
    }
}
