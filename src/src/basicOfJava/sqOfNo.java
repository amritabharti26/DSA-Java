package basicOfJava;

import java.util.Scanner;

public class sqOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. to find square : ");
        int No = sc.nextInt();
        int square = No*No;
        System.out.print("square of the no. is: ");
        System.out.println(square);
    }
}
