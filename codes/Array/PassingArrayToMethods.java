package Array;

public class PassingArrayToMethods {

    public static void main(String[] args) {
        int[] x= {10,20,30,40};
        System.out.println(x[2]);
        change(x); // 'x' address of array; change will change x[2] element
        System.out.println(x[2]);
    }
    public static void change(int[] y){ // the parameter y points to the same array as x
        y[2] =34;

    }
}
