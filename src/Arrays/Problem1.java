package Arrays;

public class Problem1 {
    public static void main(String[] args) {

        int[] arr = {1,5,3};
        int c=0;
        for (int i =0; i<arr.length; i++)
        {
            c= c+arr[i];
        }
        System.out.println("Sum of all elements is: " + " " + c);
    }
}
