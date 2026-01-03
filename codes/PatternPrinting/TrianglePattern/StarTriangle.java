package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("* "); // star print
                System.out.print(j+" "); // no. print
                System.out.print((char)(j+96)+" "); // alphabet print
            }
            System.out.println();
        }
    }
}
