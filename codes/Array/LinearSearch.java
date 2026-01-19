package Array;

public class LinearSearch {
    public static void main(String[] args) {
       int [] arr = {22,2,11,45,21,12,57,87,10};
       int target = 2;
      //  method 1 for linear search
       boolean flag = false; // false means target array me nahi hai
       for(int i=0; i<arr.length; i++){
           if(arr[i]==target){
               System.out.println("Target exists in array at index "+i);
               flag = true; // true means target array me hai
               break;
           }
       }

       // method 1 for linear search
        int  found  = -1; // -1 means target array me nahi hai
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                found = i; // any no. except -1 means target array me hai
                break;
            }
        }
        if(found!=-1) System.out.println("Target exists in array at index : "+ found);
        else System.out.println("Traget missing in array");



    }
}
