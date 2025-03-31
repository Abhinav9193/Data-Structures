package Arrays;

import java.util.Arrays;

public class Cloning {
    public static void main(String[] args) {

        int[] arr= new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 3;
        arr[4] = 1;

        System.out.println("Original Array: "  + Arrays.toString(arr));
        int[] arr_2 = arr.clone();

        System.out.println("Copied Array: " + Arrays.toString(arr_2));
        arr_2[1] = 6;
        arr_2[3] = 9;

        System.out.println("Original array remains unchanged: " + Arrays.toString(arr));
        System.out.println("Copied array after change: " + Arrays.toString(arr_2));

    }
}
