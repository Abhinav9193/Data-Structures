package Arrays;

public class Problem13 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        Problem13 obj = new Problem13();
        for(int i =0; i<n;i++)
        {
            if (left >= right) {
                break;
            }
            else if (arr[left]%2 !=0 && arr[right]%2 == 0) {
                obj.Swap(arr,left,right);
                left++;
                right--;
            }
            else if (arr[left]%2 ==0) {
                left++;
            }
            else if(arr[right] %2 != 0)
            {
                right--;
            }
        }

        System.out.println();
        System.out.println("Final Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void Swap(int[] arr, int left, int right)
    {
        int c = arr[left];
        arr[left] = arr[right];
        arr[right] = c;
    }
}
