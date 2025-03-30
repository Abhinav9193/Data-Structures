package Arrays;

public class Problem3 {
    public static void main(String[] args) {

        int[] arr = {2,5,6,7};
        int s = 6;
        int a =-1;
        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i] == s)
            {
                a=i;
            }

        }
        System.out.print("The element is present at the index: " + a);


    }
}
