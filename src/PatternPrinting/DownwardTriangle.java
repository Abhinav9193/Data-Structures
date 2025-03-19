package PatternPrinting;

import java.util.Scanner;

public class DownwardTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r= sc.nextInt();
        for(int i = 0; i < r; i++)
        {
            for(int j = r-i; j > 0; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
