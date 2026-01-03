package ifElse;

import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter cp : ");
        int cp = sc.nextInt();

        System.out.print("enter sp : ");
        int sp = sc.nextInt();

        if(sp>cp) {
            System.out.println("profit :" + (sp - cp));
            double profit = sp-cp;
            System.out.println("profit % :"+ ((profit/cp)*100));
        }

        else if(cp>sp) System.out.print("loss :"+(cp-sp));
        else System.out.print("No profit no loss");
    }
}
