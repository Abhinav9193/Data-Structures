package Arrays;

public class Problem16{

    public static boolean canPartition(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {1, 2, 3, 5};

        System.out.println("Can partition arr1? " + canPartition(arr1));
        System.out.println("Can partition arr2? " + canPartition(arr2));
    }
}
