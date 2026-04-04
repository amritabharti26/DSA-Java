package Sorting;

public class BubbleSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // create arrays
        int [] arr = {4,2,5,6,0,1,3};
        int n = arr.length;
        print(arr); //method call

        // bubble sort using nested loops
        for(int i = 1; i < n-1; i++) { // this loop repeat the process till arr sort
            for (int j = 0; j < n - 1; j++) {// this loop to apply condition to sort arr
                if (arr[j] > arr[j + 1]) { // 1st ele greater than next swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
