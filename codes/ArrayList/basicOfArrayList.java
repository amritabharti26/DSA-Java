package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class basicOfArrayList {
    public static void main(String[] args) {
        // ArrayList ek dynamic arrays hai
        // array me fixed hota hai
        // meanwhile ArrayList can grow its sizes
//        int[] num = new int[5];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(26);
        arr.add(4);
        arr.add(1);

        System.out.println(arr.get(1)); // access element of Arraylist
         arr.set(3,12); // value update in arraylist
        System.out.println(arr.get(3));

        System.out.println(arr); // print ArrayList direct without using loop by ourselves

//        int n = arr.size();
//        for(int i=0; i<n; i++){ // 1st way to print arraylist elements
//            System.out.print(arr.get(i)+" ");
//        }
//        for(int ele : arr){ // 2nd way to print arraylist elements
//            System.out.print(ele+" ");
//        }

        arr.add(10);
        System.out.print(arr);

        arr.add(1,23);
        System.out.println(arr);

        arr.remove(arr.size()-1);
        System.out.println(arr);

        Collections.reverse(arr); //1st way
        System.out.println(arr);

        // 2nd way to reverse arraylist
        int i =0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
