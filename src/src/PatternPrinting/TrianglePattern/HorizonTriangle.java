package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class HorizonTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){ //method1
            for(int j = 1; j <=n-i; j++){
                System.out.print("* "); // star print

            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){//method2: standard
            for(int j = 1; j <=n+1-i; j++){
                System.out.print("* "); // star print

            }
            System.out.println();
        }
        int a=n;
        for(int i=1; i<=n; i++){//method3: variable method
            for(int j = 1; j <=a; j++){
                System.out.print("* "); // star print

            }
            a--;
            System.out.println();
        }

        for(int i=1; i<=n; i++){//method4: not standard
            for(int j = n; j >=i; j--){
                System.out.print("* "); // star print

            }
            System.out.println();
        }
    }
}
