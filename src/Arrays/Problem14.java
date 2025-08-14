package Arrays;

public class Problem14 {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8};
        int n = arr.length;

        System.out.println("The Squared array is: ");
        for(int i =0;i<n;i++)
        {
            double m = Math.pow(arr[i],2);
            arr[i] = (int)m;
            System.out.print(arr[i] + " ");
        }
    }
}
