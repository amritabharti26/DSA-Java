package PatternPrinting.Pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //method 1
//        for(int i=1; i<=n; i++){
//            for(int j=1; j <=n-i; j++){ // upper triangle horizontal
//                System.out.print("  ");
//            }
//            for(int j=1; j <=2*i-1; j++){// pyramid structure
//               System.out.print("* ");
//            }
//            System.out.println();
//        }

        // method 2
        int nsp = n-1, nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j <=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j <=nst; j++){// pyramid structure
                System.out.print("* ");
            }
            nsp--;
            nst += 2;

            System.out.println();
        }
    }
}
