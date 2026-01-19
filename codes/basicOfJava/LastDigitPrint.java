package basicOfJava;

import java.util.Scanner;

public class LastDigitPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastdigit = Math.abs(n%10);
        System.out.println(lastdigit);
    }
}
