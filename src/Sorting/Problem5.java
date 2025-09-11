package Sorting;

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {0,5,2,0,4,3};
        moveZeroes(arr);
        for(Integer i: arr)
        {
            System.out.print(i + " ");
        }
    }

    static void moveZeroes(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j<arr.length - i -1; j++)
            {
                if(arr[j] == 0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
