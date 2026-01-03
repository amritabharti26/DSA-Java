package Method;

public class Arguments {
    public static void Sum(int a, int b){//parameters
        System.out.println(a+b);
    }
    public static void max(int a, int b){//parameters
        System.out.println(Math.max(a,b));
    }
    public static void main(String[] args) {
      Sum(2,4);//arguments
        max(2,4);

    }
}
