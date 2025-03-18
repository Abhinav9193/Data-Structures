package JavaBasics;

import java.util.Scanner;

public class ReverseOfNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int s = 0;
        System.out.print("Reverse of the number is: ");
        while(n>0)
        {
            s=n%10;
            n=n/10;
            System.out.print(s);
        }

    }
}
