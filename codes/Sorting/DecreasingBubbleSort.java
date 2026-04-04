package Sorting;

import java.util.Scanner;

public class DecreasingBubbleSort {
    public static int [] ArrayCreate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter arr elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // sort array in decreasing order

        int [] arr = ArrayCreate();
        int n = arr.length;
        print(arr);
        boolean isSorted = true;
        for(int i= 1; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if(arr[j]<arr[j+1]){
                    isSorted = false;
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] =temp;

                }
                if(isSorted==true)break;
            }
        }
        System.out.println("sorted array in decreasing order:");
        print(arr);
    }
}
