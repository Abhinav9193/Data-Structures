package Arrays;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {

        int[] arr = {2,5,3,6,8,3,9,5,8,5,9};
        int ans =0;
        for (int i =0; i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans = arr[i];
            }
        }
        System.out.println("Largest element of the array is :" + " " + ans);
    }
}
