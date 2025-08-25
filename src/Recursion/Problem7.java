package Recursion;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.println("Enter the value of q: ");
        int q = sc.nextInt();
        System.out.println("Answer by method 1 is: " + method1(p,q));
        System.out.println("Answer by method 2 is: " + method2(p,q));
    }

    static int method1(int p,int q)
    {
        if(q == 0)
        {
            return 1;
        }
        int ans = method1(p,q-1);
        return p*ans;
    }

    static int method2(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }

        if(q%2==0)
        {
            return method2(p,q/2)*method2(p,q/2);
        }
        return p*method2(p,q/2)*method2(p,q/2);
    }
}
