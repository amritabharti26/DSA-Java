package Loops.breakContinue;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " ");
            if (i == 12) continue; //skip the next print statem.
            System.out.println("this is me!");
        }
    }
}
