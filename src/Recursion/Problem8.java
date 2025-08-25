package Recursion;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter how many times: ");
        int k = sc.nextInt();

        System.out.println("Multiples of " + num + " up to " + k + " times:");
        Multiples(num, k);
    }

    static void Multiples(int num, int k) {
        if (k == 0) {
            return;
        }
        // recursive call to reach base before printing
        Multiples(num, k - 1);

        // print after recursion so it comes in order
        System.out.print(num * k + " ");
    }
}
