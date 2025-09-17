package Sorting;

public class Problem8 {

    public static void main(String[] args) {

        int[] arr = {3,2,5,1,9,4};
        int n = arr.length;
        System.out.print("Array before sorting: ");
        displayArr(arr);
        System.out.println();
        QuickSort(arr,0,n-1);
        System.out.print("Array after sorting: ");
        displayArr(arr);
    }

    static void displayArr(int[] arr)
    {
        for(Integer i: arr)
        {
            System.out.print(i + " ");
        }
    }

    static void Swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[start];
        int count = 0;
        for(int i = start + 1; i<= end; i++)
        {
            if(arr[i] < pivot)
            {
                count++;
            }
        }
        int pivotidx = start + count;
        Swap(arr, start, pivotidx);
        int i = start, j = end;
        while (i<pivotidx && j>pivotidx)
        {
            while (arr[i] <= pivotidx) i++;
            while (arr[j] > pivotidx) j--;
            if(i<pivotidx && j>pivotidx)
            {
                Swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }


    static void QuickSort(int[] arr,int start, int end)
    {
        if(start>= end)
        {
            return;
        }

        int pi = partition(arr,start,end);
        QuickSort(arr,start,pi-1);
        QuickSort(arr,pi+1,end);
    }
}
