package Array;

public class SecondMaxFind {
    public static void main(String[] args) {
        int []arr = {12,33,22,25,54,30}; // we can also take input arr from user
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // find largest element
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max)
                max = arr[i];
        }
        // find 2nd largest element
        for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i] != max) // CHECK 2nd largest element should not equal to max
                smax = arr[i];
        }
        System.out.println(max +"");
        System.out.println(smax +"");
    }
}
