package JavaBasics;

import java.util.Scanner;

public class NoOfDig {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        while(n>0)
        {
            git add src/JavaBasics/BasicCode/NoOfDig.java

            n=n/10;
            count++;
        }
        System.out.println("Number of digits are: " + count);
    }
}
