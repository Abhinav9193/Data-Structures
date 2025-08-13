package Arrays;

public class Problem12 {
    public static void main(String[] args) {

        Problem12 obj = new Problem12();

        int[] arr = {1,0,0,1,0,1,1,0,0};
        int n = arr.length;

        System.out.println("Original array: ");
        for(int m: arr)
        {
            System.out.print(m + " ");
        }

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if (left >= right) {
                break; // stop when pointers meet
            }

            if (arr[left] == 1 && arr[right] == 0) {
                obj.Swap(arr, left, right);
                left++;
                right--;
            }
            else if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
        }
        System.out.println();
        System.out.println("Final Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void Swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

