package ifElse;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. : ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println(n);
        }
        else
            System.out.print("absolute value : ");
        System.out.println(-n);
//2nd method
        if(n<0){
            n=-n;
        }
        System.out.print("absolute value : ");
        System.out.print(n);

    }

}
