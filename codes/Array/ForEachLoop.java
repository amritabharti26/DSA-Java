package Array;

public class ForEachLoop {
    public static void main(String[] args) {
        // For Each Loop only used for traverse visit each elem. of arr and display it
        int [] arr = {12,33,34,56,40};
        for(int ele : arr){
            ele *= 2; // as it store copy of arr element
//            System.out.print(ele+" ");
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
