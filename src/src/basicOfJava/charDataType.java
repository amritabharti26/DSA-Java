package basicOfJava;

public class charDataType {
    public static void main(String[] args) {
        //typecasting - ek data type se doosre data type conversion
        char ch = 'B';
        int x = ch; // implicit typecasting
        System.out.println(x);


        char small = 'b';
        int y = (int)small; // explicit typecasting
        System.out.println(y);


        char number = '0';
        System.out.println((int)number);

        char demo = 'c';
        System.out.println(demo+0);
        System.out.println(demo*1);

        // integer to character
        int n1 = 43;
        char n2 = (char)n1;
        System.out.println(n2);
    }
}
