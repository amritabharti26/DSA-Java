package ifElse;

import java.util.Scanner;

public class testLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();

        if(n%5==0) {
            System.out.println(n + " no. is divisible by 5" + "riya");
        }
        else if (n % 3 == 0) {
            System.out.println(n + "no. is divisible by 3 " + "banu");
        }
            else if (n % 5 == 0 && n % 3 == 0) {
            System.out.println(n + "no. is divisible by both 5 & 3" + "arun");
        }
            else{
                System.out.println("no. is not divisible by 5 or 3"+"isha");
            }
    }
}
