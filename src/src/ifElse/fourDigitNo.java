package ifElse;

import java.util.Scanner;

public class fourDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. : ");
        int n = sc.nextInt();

        if(n>999 && n<10000)
            System.out.println("4 digit no.");
        else
            System.out.println("Not a 4 digit no.");
    }
}
