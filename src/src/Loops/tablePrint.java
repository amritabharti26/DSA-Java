package Loops;

import java.util.Scanner;

public class tablePrint {
    public static void main(String[] args) {

//        loop 120-12+1=109 bar chal rah hai
//        109 iterations hai loop ke
        for (int i=12 ; i <= 120; i++){
            if(i%12==0)System.out.print(i+" ");
        }
        System.out.println(" ");
//      10 iterations hai loop ke
        for (int i=12 ; i <= 120; i=i+12){
            System.out.print(i+" ");
        }

        System.out.println(" ");

//      10 iterations hai loop ke
        for (int i=1 ; i <= 10; i=i+1){
            System.out.print(i*13+ " "); // for any no. highly recommended
        }




    }
}
