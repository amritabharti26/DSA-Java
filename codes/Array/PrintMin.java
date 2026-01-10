package Array;

import java.util.Scanner;

public class PrintMin {
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

//      int min = Integer.MAX_VALUE;
//      System.out.println(min+" ");
//      jis ki value stored : 2147483647

        int min = arr[0];
        for (int i = 0; i<n; i++){
            if(arr[i]< min) min = arr[i]; // check each element with current min value stored

        }
        System.out.print("Min array element is : "+ min +" ");
    }
}
