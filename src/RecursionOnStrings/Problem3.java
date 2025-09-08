package RecursionOnStrings;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        String rev = reverse(s,idx);
        if(rev.equals(s))
        {
            System.out.printf("%s is a Palindrome String", s);
        }
        else
        {
            System.out.printf("%s is not a Palindrome String", s);
        }
    }

    static String reverse(String s, int idx)
    {
        if(idx == s.length())
        {
            return "";
        }

        return reverse(s,idx+1) + s.charAt(idx);
    }
}
