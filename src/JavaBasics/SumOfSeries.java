package JavaBasics;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int s=0;
        for(int i = 1; i<=n;i++)
        {
            if(i%2!=0)
            {
                s=s+i;
            }
            else
            {
                s=s-i;
            }

        }
        System.out.println("Sum of the series is: " + s);
    }
}
