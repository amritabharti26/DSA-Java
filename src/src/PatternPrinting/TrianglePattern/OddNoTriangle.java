package PatternPrinting.TrianglePattern;

import java.util.Scanner;

public class OddNoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int num =1; // print 1 in every row
            for(int j = 1; j <=i; j++){
                System.out.print(num+" "); //method 1
                num+=2;

                System.out.print((2 * j - 1) + " "); //method 2

               // Wrong Approach

//                if(j==1)
//                    System.out.print("1 ");
//                else if(j==n-2 || i==n-2)
//                    System.out.print("3 ");
//                else if (j==n-1 || i==n-1) {
//                    System.out.print("5 ");
//
//                } else System.out.print(7+" ");

            }
            System.out.println();
        }
    }
}
