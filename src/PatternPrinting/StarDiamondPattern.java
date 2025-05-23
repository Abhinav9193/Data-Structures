package PatternPrinting;

import java.util.Scanner;

public class StarDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++)
        {
            for (int j = 1; j <= r - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = r - 2; i >= 0; i--)
        {
            for (int j = 1; j <= r - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

