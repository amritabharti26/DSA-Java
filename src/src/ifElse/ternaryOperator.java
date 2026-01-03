package ifElse;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        //Ternary Operator
        // condition ? sach : jhoot

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.:");
        int n = sc.nextInt();

        System.out.println((n%2==0) ? "even" : "odd");

    }
}
