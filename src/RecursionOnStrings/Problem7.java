package RecursionOnStrings;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {2,3,9,4,7,4,8,3};
        int n = arr.length;
        int sum = 0;

        subsets(arr,n,0,sum);
    }

    static void subsets(int[] arr, int n,int idx, int sum)
    {
        if(idx>= n)
        {
            System.out.print(sum + " ");
            return;
        }

        subsets(arr, n,idx+1, sum + arr[idx]);
        subsets(arr, n, idx+1, sum);
    }
}
