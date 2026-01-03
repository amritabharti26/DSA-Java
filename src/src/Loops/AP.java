package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        //AP find for first 10 terms 2,5,8,11....
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int count =0;
        for(int i= 2; i<= 3*n-1; i+=3){
            System.out.print(i+" ");
            count++;

        }
        System.out.print("loop run "+ count +" times");

        System.out.println();
        //2,5,8,11....
        // method2 using a variable
        int counter= 0;
    int a = 2, d=3;
    for(int j=1; j<=n; j++){
        System.out.print(a+" ");
        a+=d;
        counter++;
    }
        System.out.print("loop run "+ counter +" times");
    }

}
