package Array;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort array --> ascending order
        int[] arr ={1,-3,44,34,22,10,-2,0};
        print(arr);
        Arrays.sort(arr); // sort an array using BuiltIn method or function
        print(arr);
    }
    public static void print(int [] arr){
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
