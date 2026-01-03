package basicOfJava;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input from user
        System.out.print("Enter Radius: ");
        double r= sc.nextDouble();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.print("area is: ");
        System.out.println(area);

        System.out.print("enter length:");
        int l = sc.nextInt(); // for user input
        System.out.print("enter breadth:");
        int b = sc.nextInt();
        System.out.print("enter height:");
        int h = sc.nextInt();


//        int l = 3, b = 4, h = 5;
        int TSA = 2*(l*b + b*h + h*l );
        System.out.print("TSA is:");
        System.out.println(TSA);

    }
}
