package RecursionOnStrings;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        printSubSequences(s,"");
    }

    static void printSubSequences(String s, String currChar)
    {
        if(s.length() == 0)
        {
            System.out.print(currChar + " ");
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);

        printSubSequences(remString, currChar + curr);

        printSubSequences(remString, currChar);
    }
}
