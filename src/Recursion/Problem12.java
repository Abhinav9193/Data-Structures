package Recursion;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        System.out.println("Greatest common divisor of x and y is: " + Euclid(x,y));
    }

    static int Euclid(int x,int y)
    {
        if(y==0)
        {
            return x;
        }

        return Euclid(y,x%y);
    }
}
