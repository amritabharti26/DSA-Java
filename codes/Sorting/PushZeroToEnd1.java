package Sorting;

import java.util.Scanner;

public class PushZeroToEnd1 {
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

        // Move all Zeros to end : Optimised Version Interview important
        int j = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving Zeros: ");
        print(arr);
    }
}

// TIME COMPLEXITY of Optimised Method: O(n)
// SPACE COMPLEXITY of Optimised Method: O(1)

