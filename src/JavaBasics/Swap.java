package JavaBasics;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b =sc.nextInt();
        System.out.println();
        int t = b;
        b=a;
        a=t;

        System.out.print("The value of a after swapping is: " + a);
        System.out.println();
        System.out.print("the value of b after swapping is: " + b);

    }
}
