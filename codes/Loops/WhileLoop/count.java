package Loops.WhileLoop;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int count =0;
        while (n!=0) { // count no. of digits
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
