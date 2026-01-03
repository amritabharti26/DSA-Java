package Loops.WhileLoop;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum+= (n%10); // Modulus Gives the remainder: 345 % 10 = 5
            n/=10; // Divides the number and gives quotient: 345 / 10 = 34 remove lastDigit
        }
        System.out.println((sum>0) ? sum : -sum);
    }
}
