package Array;

public class TwoSum {
    public static void main(String[] args) {
        // adding to elements of array such that equal to target
        int []arr = {12,33,22,25,54,30};
        int target =34;
        for (int i =0; i<arr.length; i++){ // 1st loop 0 index se chalegi
            for(int j= i+1; j<arr.length; j++){ // 2nd loop i+1 index se chalegi
                if(arr[i]+arr[j]==target) System.out.println("true"+" "+i+" "+j);
            }
        }
    }
}
