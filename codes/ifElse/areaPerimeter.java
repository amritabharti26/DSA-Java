package ifElse;

import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter l :");
        int l = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);


        if(area>perimeter)
            System.out.println(area+" area is greater");
        else System.out.println(perimeter+" perimeter is greater");
    }
}
