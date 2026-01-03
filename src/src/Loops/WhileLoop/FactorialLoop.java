package Loops.WhileLoop;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*= i;//n no. of times loop chalege or i current fact value se multiple ho jayegi
            System.out.println(fact); //printing the factorial at every step

        }
        System.out.println(fact);
    }
}
