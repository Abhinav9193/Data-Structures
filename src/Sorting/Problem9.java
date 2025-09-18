package Sorting;

public class Problem9 {

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
        System.out.println("Array before Sorting: ");
        display(arr);
        countSort(arr);
        System.out.println("\nArray after Sorting: ");
        display(arr);
    }

    static void display(int[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    static void countSort(int[] arr) {
        int max = maxVal(arr);
        int[] freq = new int[max + 1];

        for (int k = 0; k < arr.length; k++) {
            freq[arr[k]]++;
        }

        int index = 0;
        for (int j = 0; j < freq.length; j++) {
            while (freq[j] > 0) {
                arr[index++] = j;
                freq[j]--;
            }
        }
    }

    static int maxVal(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
}

