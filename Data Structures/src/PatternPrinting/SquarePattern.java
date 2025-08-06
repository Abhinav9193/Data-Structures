package PatternPrinting;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();

        for(int i =0;i<r;i++)
        {
            for(int j =0;j<r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
