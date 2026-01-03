package Method;

import java.util.Scanner;

public class MaxOf4No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));
    }
}
