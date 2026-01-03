package ifElse;

import java.util.Scanner;

public class locationOfPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();

        if(x>0 && y>0) System.out.println("point lies in 1st quad.");
        else if (x<0 && y>0) System.out.println("point lies in 2nd quad.");
        else if (x<0 && y<0) System.out.println("point lies in 3rd quad.");
            else System.out.println("point lies in 4th quad.");
        }
    }

