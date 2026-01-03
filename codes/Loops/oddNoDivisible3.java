package Loops;

public class oddNoDivisible3 {
    public static void main(String[] args) {
        //print all ood no.s divisible by 3 from 1 to 100
        System.out.println("odd no divisible by 3");

        for(int i=1; i<=100; i++) {
            if (i % 3 == 0 && i % 2 != 0) //print only: dono condition true hone par
                System.out.println(i + " ");
        }
    }


}
