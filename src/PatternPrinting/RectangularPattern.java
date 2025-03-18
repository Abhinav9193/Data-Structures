package PatternPrinting;

import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int c = sc.nextInt();
        System.out.println("The Pattern Printed looks like: ");
        for(int i =1; i<=r;i++)
        {
            for (int j =1; j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
