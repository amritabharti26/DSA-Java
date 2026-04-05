package Sorting;

import java.util.Scanner;

public class SelectionSort {
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

      // SELECTION SORT
      for(int i=0; i<n-1; i++){
          int min = Integer.MAX_VALUE;
          int minidx = -1;
        for(int j=i; j<n; j++){
            if(arr[j]<min){
                min = arr[j];
                minidx = j;

            }
        }
          //swap
          int temp = arr[i];
          arr[i]= arr[minidx];
          arr[minidx] = temp;
      }

        System.out.println("Sorted array:");
         print(arr);
    }
}
