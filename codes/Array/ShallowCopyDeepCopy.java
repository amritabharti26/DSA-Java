package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr ={10,20,22,34};
        // x is shallow copy of arr
        int[] x = arr; // 'x' aur 'arr' same memory share kar gye
        x[0]= 26;
        System.out.println(arr[0]);

        int [] deep = Arrays.copyOf(arr,arr.length); // deep copy: give a new full separate copy of array
        deep[0] = 100;
        System.out.println(arr[0]); // give original array element
        System.out.println(deep[0]); // give a new changed element stored in deep arr keeping original 'arr' as it is

        int [] num = new int[arr.length]; // this also create a deep array using new keyword, ensure a new separate array create
        for(int i= 0; i< arr.length; i++){
            num[i]= arr[i];
        }

    }
}
