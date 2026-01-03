package Loops.breakContinue;

import java.util.Scanner;

public class compositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        boolean flag = false;//false means prime no.
        for (int i = 2; i <= n -1 ; i++) {
            if (n % i == 0) { // 'i' to 'n' ka ek factor nikla
                System.out.println("composite No. : " + i);
                flag = true; //true means composite no.
                break;
            }
        }
        if(n==1) System.out.println("neither prime nor composite no.");
        else if(flag == false) System.out.println("prime no.");
        else System.out.println("composite no.");
    }
}
