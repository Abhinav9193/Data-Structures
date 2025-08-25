package Recursion;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.println("Enter the value of q: ");
        int q = sc.nextInt();
        System.out.println(power(p,q));
    }

    static int power(int p,int q)
    {
        if(q == 0)
        {
            return 1;
        }
        int ans = power(p,q-1);
        return p*ans;
    }
}
