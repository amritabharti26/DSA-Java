package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class invertedRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0, nst = n;
        for(int i=1; i<=n; i++){ // awesome Method
            for(int j=1; j <=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j <=nst; j++){
                System.out.print("* ");
            }
            nsp++;
            nst -= 1;

            System.out.println();
        }

//        for(int i=0; i<n; i++){ // chatgpt method
//            for(int j=0; j<i; j++){
//                System.out.print("  ");
//            }
//            for (int j=i; j<n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
