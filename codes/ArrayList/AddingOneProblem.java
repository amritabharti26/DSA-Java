package ArrayList;

import java.util.Collections;
import java.util.Vector;

public class AddingOneProblem {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};   // example input

        Vector<Integer> ans = new Vector<>(); //created vector to store final digits
        int carry = 1; // we want to add 1 to no.s

        for (int i = arr.length - 1; i >= 0; i--) { // loop right to left
            int sum = arr[i] + carry;
            ans.add(sum % 10); // '%' gives last digit
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);

        // printing result
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
