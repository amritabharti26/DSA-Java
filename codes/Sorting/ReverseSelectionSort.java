package Sorting;

import java.util.Scanner;

public class ReverseSelectionSort {
    public static int [] ArrayCreate(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.print("Enter array elements: ");
    for (int i=0; i<n; i++){
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
        int [] arr = ArrayCreate();
        int n = arr.length;
        print(arr);

        // REVERSE SELECTION SORT
        for(int i=n-1; i>0; i--){
            int Max = Integer.MIN_VALUE;
            int Maxidx = 0;
            for(int j=0; j<=i; j++){
                if(arr[j]>Max){
                    Max = arr[j];
                    Maxidx = j;

                }
            }
            //swap
            int temp = arr[i];
            arr[i]= arr[Maxidx];
            arr[Maxidx] = temp;
        }

        System.out.println("Sorted array:");
        print(arr);
    }
}
