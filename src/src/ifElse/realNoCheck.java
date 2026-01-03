package ifElse;

import java.util.Scanner;

public class realNoCheck {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter no. :");
         double n = sc.nextDouble(); // n = 4.76633
         int x = (int)n; // x = 4
         if(n-x == 0)
        System.out.println("no. is integer");

        else
        System.out.println("no. is NOT integer");

    }
}
