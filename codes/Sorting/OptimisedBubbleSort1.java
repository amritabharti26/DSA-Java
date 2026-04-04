package Sorting;

import java.util.Scanner;

public class OptimisedBubbleSort1 {
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
        int [] arr = ArrayCreate();
        int n = arr.length;
        print(arr);

        // Bubble Sort Optimised
        for(int i = 1; i < n-1; i++) {
            int swap =0;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("array already sorted");
                break;
            }
        }
        System.out.println("Sorted Array: ");
        print(arr);
    }
}


// TIME COMPLEXITY:
// BEST CASE: O(n)
// AVG CASE:  O(n^2)
// WORST CASE:  O(n^2)
