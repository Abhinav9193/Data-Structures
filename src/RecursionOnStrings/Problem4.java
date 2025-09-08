package RecursionOnStrings;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(palindrome(s,0,n-1));
    }

    static boolean palindrome(String s, int l, int r)
    {
        if(l>=r)
        {
            return true;
        }

        return (s.charAt(l) == s.charAt(r) && palindrome(s,l+1,r-1));
    }
}
