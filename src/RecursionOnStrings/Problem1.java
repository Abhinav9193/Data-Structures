package RecursionOnStrings;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        System.out.println("The String after removing A's is: " + removeA(s, 0));
    }

    static String removeA(String s, int idx) {

        if (idx == s.length()) {
            return "";
        }

        char current = s.charAt(idx);
        String rest = removeA(s, idx + 1);

        if (current == 'a' || current == 'A') {
            return rest;
        } else {
            return current + rest;
        }
    }
}

