package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.print("Enter array element: ");
        for (int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i=0; i< arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted)System.out.println("array is sorted : " + Arrays.toString(arr)); // TO PRINT ARR ELEM.
        else System.out.println("array is not sorted : "+ Arrays.toString(arr));
    }
}

// SPACE COMPLEXITY: O(1)