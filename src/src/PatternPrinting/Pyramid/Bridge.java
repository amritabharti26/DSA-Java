package PatternPrinting.Pyramid;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1, nst =n-1;
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j <=n-i; j++) {
                System.out.print("* ");
            }

            for(int j=1; j <=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j <=n-i; j++) {
                System.out.print("* ");
            }
//            for(int j=1; j <=nst; j++){// pyramid structure
//                System.out.print("* ");
//            }
            nsp+= 2;
//            nst--;
            System.out.println();
        }

    }
}
