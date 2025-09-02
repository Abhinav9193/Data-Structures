package Recursion;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        System.out.println("Greatest common divisor for x and y is: " + iGCD(x,y));
    }

    static int iGCD(int x, int y)
    {
        while (x%y != 0)
        {
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
}
