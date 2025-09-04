package RecursionOnArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,4,5,4,4,6};
        System.out.println("Enter the value of target: ");
        int target = sc.nextInt();
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        ArrayList<Integer> result = allIndices(arr,target,idx);
        System.out.println("The final list is: " + result);
    }

    static ArrayList<Integer> allIndices(int[] arr, int target, int idx)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx>= arr.length)
        {
            return ans;
        }

        if(arr[idx] == target)
        {
            ans.add(idx);
        }

        ArrayList<Integer> recursiveAns = allIndices(arr,target, idx+1);
        ans.addAll(recursiveAns);
        return ans;
    }
}
