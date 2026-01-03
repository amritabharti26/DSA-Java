package Method;

public class PassByValueOrReference {
    public static void change(int a){
        a = 5;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
}
