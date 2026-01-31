package Array;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size: ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // created array

        System.out.println("enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i+=2){
            // if((i+1)== arr.length)break;// either this if last arr elem bache
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= temp;
        }

        // result display
        System.out.println("WaveArray: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
