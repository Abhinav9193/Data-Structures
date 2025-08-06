package PatternPrinting;
import java.util.Scanner;

public class P6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input number of steps to rotate
            System.out.print("Enter the number of steps to rotate: ");
            int k = sc.nextInt();
            k = k % n; // to handle k > n

            // Create a temporary array to store rotated result
            int[] rotated = new int[n];

            // Copy last k elements to the beginning of rotated array
            for (int i = 0; i < k; i++) {
                rotated[i] = arr[n - k + i];
            }

            // Copy the remaining elements
            for (int i = k; i < n; i++) {
                rotated[i] = arr[i - k];
            }

            // Print the rotated array
            System.out.println("Array after rotation:");
            for (int i = 0; i < n; i++) {
                System.out.print(rotated[i] + " ");
            }
        }
}
