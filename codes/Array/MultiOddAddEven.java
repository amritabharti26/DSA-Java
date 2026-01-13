package Array;

public class MultiOddAddEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { // array's index check even or odd
                arr[i] *= 2; // odd hu to multiple 2
            } else
                arr[i] += 10; // even hu to add 10
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // printing the final array
        }

    }
}