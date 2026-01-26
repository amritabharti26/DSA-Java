package Array;

import java.util.Scanner;

public class ReverseArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size: ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // created array

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt(); // enter arr elements
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" "); // display arr elements
        }

        //reverse arr steps made two pointers i and j
        n = arr.length;
        int i=0, j=n-1; // i start for 0 index while j start from n-1 index
        while(i<j){
            // snap arr elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; // move forward
            j--; // move backward

        }
        // for each loop use to display reverse arr elements
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
