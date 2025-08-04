package JavaBasics;

import java.util.Scanner;

public class Sum {
    int add(int a, int b)
    {
        int s;
        s = a+b;
        return s;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Sum sum = new Sum();
        int ans = sum.add(x,y);
        System.out.println("Sum of the numbers is: " + ans );
        System.out.println(Math.sqrt(81));
    }
}
