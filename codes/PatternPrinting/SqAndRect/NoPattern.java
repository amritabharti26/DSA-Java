package PatternPrinting.SqAndRect;

import java.util.Scanner;

public class NoPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
