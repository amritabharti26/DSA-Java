package PatternPrinting.HollowRectangle;

import java.util.Scanner;

public class MultipleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // sq size (must be odd for perfect X)

        for(int i=1; i<=n; i++){

            for(int j = 1; j <=n; j++){
                if (i == j || i + j == n + 1) // print star left diagonal right diagonal
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
