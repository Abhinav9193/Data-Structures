package JavaBasics;

import java.util.Scanner;

public class SumOfDigInNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int no = scanner.nextInt();
        int s=0;
        while(no!= 0)
        {
            s= s + (no%10);
            no=no/10;
        }
        System.out.print("Sum of Digits is: " + s);
    }
}
