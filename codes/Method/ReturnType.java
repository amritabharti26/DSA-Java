package Method;

public class ReturnType {
    public static int amu(int a){
        System.out.println("im amu");
        if(a>0)return 2;
        else return 1;//khatam
//        System.out.println("hi"); will give error: unreachable
    }
    public static void main(String[] args) {
        amu(0); // only function call
        int x =amu(0);
        System.out.println(x); // function call as well return value of the fn
        System.out.println(8-amu(0));
    }
}
