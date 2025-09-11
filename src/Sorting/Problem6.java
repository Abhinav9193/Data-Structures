package Sorting;

public class Problem6 {

    public static void main(String[] args) {
        String[] arr = {"mango","apple","kiwi","papaya","dry","fruits"};
        Lexicography(arr);
        for(String i: arr)
        {
            System.out.print(i + " ");
        }

    }

    static void Lexicography(String[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n;i++)
        {
            int min = i;

            for(int j = i+1; j<n; j++)
            {
                if(arr[j].compareTo(arr[min])<0)
                {
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
