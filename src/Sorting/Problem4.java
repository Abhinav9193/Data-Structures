package Sorting;

public class Problem4 {

    public static void main(String[] args) {
        int[] arr = {8,3,6,2,4,5};
        insertionSort(arr);
        for(Integer i: arr)
        {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr)
    {
        for(int i = 1; i< arr.length;i++)
        {
            int j = i;
            while (j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
