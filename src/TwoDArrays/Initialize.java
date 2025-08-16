package TwoDArrays;

public class Initialize {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 2;
        arr[1][0] = 6;
        arr[1][1] = 7;
        arr[1][2] = 7;

        System.out.println("The array is: ");
        for(int i = 0; i<arr.length;i++)
        {
            for (int j =0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
