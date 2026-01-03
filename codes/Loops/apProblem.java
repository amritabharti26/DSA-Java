package Loops;

import java.util.Scanner;

public class apProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int a = 99,d = -4;
        int count = 0; // to check iteration
        for(int i=1; i<=n; i++){ //method1 to find decreasing AP
            System.out.println(a+" ");
            a+=d;
            count++;
        }
        System.out.println("loop run "+ count + " times");

        // method2 to find decreasing AP
        int counter =0;
        for(int j= 99; j>= 103-4*n; j-=4){
            System.out.println(j+" ");
            counter++;

        }
        System.out.print("loop run "+ counter +" times");
    }
}
