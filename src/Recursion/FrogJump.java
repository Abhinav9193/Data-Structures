package Recursion;

import static java.lang.Math.abs;

public class FrogJump {
    public static void main(String[] args) {

        int[] h = {10,30,40,20};

        int n = h.length;
        System.out.println(frog(h,n,0));

    }

    static int frog(int[] h, int n, int idx)
    {
        if(idx == n-1)
        {
            return 0;
        }

        if(idx == n-2)
        {
            return Math.abs(h[idx] - h[idx+1]) + frog(h,n,idx+1);
        }

        int ans = Math.abs(h[idx] - h[idx+1]) + frog(h,n,idx+1);

        int ans2 = Math.abs(h[idx] - h[idx+2]) + frog(h,n,idx+2);

        return Math.min(ans,ans2);
    }
}
