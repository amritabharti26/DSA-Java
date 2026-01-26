package Array;

import java.util.Scanner;

public class RotateArray {
    static void reverse(int[] arr, int i , int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size: ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // created array

        System.out.println("enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter rotation (d): ");
        int d = sc.nextInt();
        d %= n; // handle d > n case

        // Reverse method for rotating left by d
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}

