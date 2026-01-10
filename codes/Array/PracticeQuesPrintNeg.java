package Array;

import java.util.Scanner;

public class PracticeQuesPrintNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array");
        for (int i= 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("entered array");
        for (int i =0; i<5; i++){
            if(arr[i]<0)
            System.out.println(arr[i]+" ");
        }

    }
}
