package Array;

import java.util.Scanner;

public class PrintMathsOpertions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];//initialise array

        //input of array
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // sum of array elements
        int sum = 0;
        for (int i= 0; i<n; i++){
            sum +=arr[i]; //print sum of array element

        }
        System.out.println(sum+" ");

        //product of Array elements
        int product = 1;
        for (int i= 0; i<n; i++){
           product *=arr[i]; //print product of array element

        }
        System.out.println(product +" ");
    }
}
