package JavaBasics;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter a range of numbers: ");
        int r = sc.nextInt();

        for (int i =2;i<r;i++)
        {

            if(n%i==0 && i!=n)
            {
                System.out.println("The given number is not prime haha");
                return;
            }
        }

        System.out.println("The given number is prime");
    }
}
