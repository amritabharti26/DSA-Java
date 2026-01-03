package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class flipedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=n; j++){

                if((i+j)>n){//method 1
                    System.out.print("* "); // star print
                    System.out.print((char)(i+64) +" ");// alphabet print
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
//
//
//        for(int i=1; i<=n; i++){
//            int a=1;
//            for(int j = 1; j <=n; j++){
//
//                if((i+j)>n){
//                    //method 1
//                    System.out.print(a+" ");
//                a+=1;
//                }
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
////
         //method 2  using two loops inside main loop or Row loop
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){ // upper horizonal Triangle blank
//                System.out.print("  ");
//            }
//            for(int j =1; j<=i; j++){ //lower vertical Triangle star
//              System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
