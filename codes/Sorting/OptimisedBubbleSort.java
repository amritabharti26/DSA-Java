package Sorting;

import java.util.Scanner;

public class OptimisedBubbleSort {
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
        // create arrays
        int [] arr = ArrayCreate();
        int n = arr.length;
        print(arr); //method call

        // optimised bubble sort using nested loops
        boolean isSorted = true;
        for(int i = 1; i < n-1; i++) { // this loop repeat the process till arr sort
            for(int j = 0; j <n-1; j++){ // check if loop is already sorted or not
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) System.out.println("array already sorted"); break;

            // this loop sort array
            for (int j = 0; j < n-1; j++) {// this loop to apply condition to sort arr
                if (arr[j] > arr[j + 1]) { // 1st ele greater than next swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        print(arr);
    }
}
