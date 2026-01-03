package Loops;

import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {
        for(int i=65; i<=90; i++){ //capital ascii 65 to 90 tak
            System.out.println((char)i + " " + i);
        }
        System.out.println();

        for(int i=97; i<=122; i++){ //small ascii 97 to 122 tak
            System.out.println((char)i + " " + i);
        }

    }
}
