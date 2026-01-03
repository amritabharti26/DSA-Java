package Method;

public class Syntax {
    public static void amrita(){
        System.out.println("amrita acchi ladki hai");
        amu();
    }
    public static void main(String[] args) {
       // function or method call
        System.out.println("Ha ye hai");
        amrita(); //infinite function or method call

    }
    public static void amu(){
        System.out.println("amrita acchi hai");
        amrita();
    }

}

