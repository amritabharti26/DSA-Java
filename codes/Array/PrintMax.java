package Array;

import java.util.Scanner;

public class PrintMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int [] arr = new int[n];//initialise array

        //input of array
        System.out.println("Enter array element: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//      int max = Integer.MIN_VALUE;
// jis ki value stored : -2147483648
        int max = arr[0];
        for (int i = 0; i<n; i++){
            if(arr[i]>max) max = arr[i]; // check each element with current max value stored

        }
        System.out.print("Max array element is : "+max+" ");
    }
}
