package Array;

import java.util.Scanner;

public class Segregate0and1Way2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size: ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // created array

        System.out.println("enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int numOfZeros = 0;
        int numOfOnes = 0;

        // count 0 and 1
        for(int ele : arr){
            if(ele ==0)
                numOfZeros++;
            else
                numOfOnes++;
        }

        //fill zeros
        for(int i =0; i<numOfZeros; i++){
            arr[i]=0;
        }
        //fill Ones
        for(int i =numOfZeros; i<n; i++){
            arr[i]=1;
        }

        // result display
        System.out.println("Array after Segregation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
