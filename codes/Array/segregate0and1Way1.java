package Array;

import java.util.Scanner;

public class segregate0and1Way1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size: ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // created array

        System.out.println("enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
         n = arr.length;
        int i = 0;
        int j = n-1;

        // segregate 0 onto left side and 1 onto right side like 0 0 0 0 1 1 1 1
        while(i<j){
            if(arr[i]==0){ //arr[left]==0
                i++;
            } else if (arr[j]==1) { //arr[right]==1
                j--;
            }
            else { // when arr[left] ==1 & arr[right]==0
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        // result display
        System.out.println("Array after Segregation: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
