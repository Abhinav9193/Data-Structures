package RecursionOnArrays;
import java.util.Arrays;
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(Array(arr,n)));
    }

    static int[] Array(int[] arr,int n)
    {
        if(n==0)
        {
            return arr;
        }
        return Array(arr,n-1);
    }
}
