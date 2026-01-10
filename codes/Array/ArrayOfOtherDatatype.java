package Array;

public class ArrayOfOtherDatatype {
    public static void main(String[] args) {
        //double ka array
        double [] arr = new double[5];
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //characters ka array
        char [] name = new char[5];
        for (int i = 0; i< name.length; i++) {
            System.out.print(name[i]+" ");
        }
        System.out.println();

        //string ka array
        String[] x= {"amrita is a ...", "amrita","amu"}; // array of strings
        for (int i = 0; i< x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
