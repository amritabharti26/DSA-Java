package Array;

public class BasicOfArray {
    public static void main(String[] args) {
        int [] arr ={26,5,7,6,12};// Best practice " [] x instead of x[] "
        System.out.println(arr[2]);

        //updating an Array : mutability
        arr[2] = 90;
        System.out.println(arr[2]); // access element through indexing

        // 2nd method of initialization of array using "new" keyword
        int [] num = new int[4]; // indexing 0 to 3


    }
}
