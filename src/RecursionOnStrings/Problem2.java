package RecursionOnStrings;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        System.out.println("The reversed string is: " + reverse(s,idx));
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
