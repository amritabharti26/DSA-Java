package PatternPrinting.HollowRectangle;

import java.util.Scanner;

public class PlusSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n= row = col; // no. of row and col
        int mid = (n%2) + 1;


        for(int i=1; i<=row; i++){

            for(int j = 1; j <=col; j++){
                if(i==mid || j==mid) // print star at mid
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
