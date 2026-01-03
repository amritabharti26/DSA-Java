package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class AlterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0) //odd rows ke liye no. print ho
            for(int j = 1; j <=i; j++){
                System.out.print(j+" ");
            }
            else{ // even rows ke liye alphabet
                for(int j = 1; j <=i; j++){
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
