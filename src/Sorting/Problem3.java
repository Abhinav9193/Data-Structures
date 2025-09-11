package Sorting;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 9, 1};

        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
