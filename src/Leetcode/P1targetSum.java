package Leetcode;

import java.util.Scanner;

public class P1targetSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the target sum: ");
        int t = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the numbers for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k <arr.length; k++) {
                if ((arr[k] + arr[j] == t)) {
                    System.out.println("Target is formed with the numbers: " + " " + j + " " + "and" + " " + k);
                }
            }
        }

    }
}
