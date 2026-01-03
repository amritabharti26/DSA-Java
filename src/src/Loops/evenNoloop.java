package Loops;

import java.util.Scanner;

public class evenNoloop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER N: ");
//        int n = sc.nextInt();

        // 100 iteration hoge
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " even");
            }
            counter++;

        }
        System.out.println("loop run " + counter + " times");

        // 50 iterations hoge
        int count = 0;
        for (int j = 2; j <= 100; j = j + 2) {
            System.out.println(j + " ");
            count++;
        }
        System.out.println("Loop ran " + count + " times");
    }



}


