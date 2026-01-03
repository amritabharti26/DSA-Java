package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class AlterHorizon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){//method2: standard
            for(int j = 1; j <=n+1-i; j++){
                System.out.print((char)(j+96)+" "); // print lowercase

            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){//method2: standard
            for(int j = 1; j <=n+1-i; j++){
                System.out.print((char)(i+64)+" "); // print uppercase

            }
            System.out.println();
        }

    }
}
