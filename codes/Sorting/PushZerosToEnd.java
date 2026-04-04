package Sorting;

import java.util.Scanner;

public class PushZerosToEnd {

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

        // Move all Zeros to end
        for(int i = 1; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] ==0 && arr[j+1] !=0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after moving Zeros: ");
        print(arr);
    }
}

// TIME COMPLEXITY of Bubble Method: O(n^2)
// SPACE COMPLEXITY of Optimised Method: O(1)