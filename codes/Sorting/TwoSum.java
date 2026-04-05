package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
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
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayCreate();
        int n = arr.length;
        System.out.println("Enter target: ");
        int target = sc.nextInt();

       Arrays.sort(arr);
       print(arr);
        int i =0, j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target) {
                System.out.println("pair found:"+arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            else if (arr[i]+arr[j]<target) i++;
            else if (arr[i]+arr[j]>target) j--;
        }
    }
}
