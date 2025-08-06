package PatternPrinting;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("Numbers after swapping are: ");
        System.out.println("First Number: " + a);
        System.out.println("Second number: " + b);
    }
}
