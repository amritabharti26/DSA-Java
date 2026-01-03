package PatternPrinting.SqAndRect;

import java.util.Scanner;

public class AsciiPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j = 65; j <=68; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=1; i<=n; i++){
            for(int j = 97; j <=100; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
