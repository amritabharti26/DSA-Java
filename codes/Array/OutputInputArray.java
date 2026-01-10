package Array;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {2,4,6,7,33,22,45}; //array initialise and declare
//        System.out.println(arr.length); //array size find
//        int n = arr.length;
//        for (int i = 0; i<n; i++){
//            System.out.print(arr[i]+" "); // loop to print each initialise elements
//        }


        int[] num = new int[7]; //declare a empty array of size 7 using 'new' keyword

//        for(int i=0; i<7; i++){
//           System.out.print(num[i]+" "); loop display default value i.e zero
//        }
        //input array element
        System.out.print("enter array elements:");
        for (int i=0; i<7; i++) {
            num[i] = sc.nextInt();
        }

        //output array element
        System.out.print("entered array elements:");
        for (int i=0; i<7; i++) {
            System.out.print(2*num[i]+" ");
        }
    }
}
