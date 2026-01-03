package ifElse;

import java.util.Scanner;

public class ifElseQuestion1 {
    public static void main(String[] args) {
        //odd even
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.");
        int n =  sc.nextInt();
        if (n%2==0){
            System.out.println("even no.");
        }
        else {
            System.out.println("odd no.");
        }
        Scanner pInteger = new Scanner(System.in);
        System.out.print("enter +ve no.: ");
        int no1 = pInteger.nextInt();
        if(no1%5==0){
            System.out.println("no. is divisible by 5");
        }
        else
            System.out.println("NOT no. is divisible by 5");

    }
}
