package PatternPrinting;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int firstRepeating = -1;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    firstRepeating = arr[i];
                    break outer;
                }
            }
        }

        if (firstRepeating != -1) {
            System.out.println("\nFirst repeating element is: " + firstRepeating);
        } else {
            System.out.println("\nNo repeating elements. Returning: -1");
        }
    }
}
