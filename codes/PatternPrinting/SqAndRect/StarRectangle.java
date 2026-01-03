package PatternPrinting.SqAndRect;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i<=row; i++){ // kitne line me print karne hain
            for(int j =1; j<=col; j++){ // ek line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
