package Recursion;

import java.util.Scanner;

public class KeypadProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String dig = sc.nextLine();

        String[] kp = {"","","abc","def", "ghi", "jkl" , "mno", "pqrs", "tuv" , "wxyz"};

        KeyPad(dig,kp,"");
    }

    static void KeyPad(String dig, String[] kp, String res)
    {
        if(dig.length() == 0)
        {
            System.out.print(res + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i = 0; i<currChoices.length();i++)
        {
            KeyPad(dig.substring(1),kp,res + currChoices.charAt(i));

        }
    }
}
