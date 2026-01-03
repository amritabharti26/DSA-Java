package ifElse;

import java.util.Scanner;

public class sideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st side of triangles : ");
        int a = sc.nextInt();

        System.out.println("enter 2nd side of triangles : ");
        int b = sc.nextInt();

        System.out.println("enter 3rd side of triangles : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b)
            System.out.println("valid triangle condition");
        else System.out.println("invalid triangle condition");


    }
}
