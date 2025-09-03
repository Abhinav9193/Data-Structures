package RecursionOnArrays;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,4};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of index: ");
        int idx = sc.nextInt();

        System.out.println("Enter the value of the element to be searched: ");
        int n = sc.nextInt();

        System.out.println("The status of element's existence is: " + LinearSearch(arr, n, idx));
    }

    static boolean LinearSearch(int[] arr, int n, int idx) {
        if (idx >= arr.length) {
            return false;
        }
        if (arr[idx] == n) {
            return true;
        }
        return LinearSearch(arr, n, idx + 1);
    }
}
