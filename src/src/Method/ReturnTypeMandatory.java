package Method;

public class ReturnTypeMandatory {
    public static void main(String[] args) {
        System.out.println(amrita(4));
    }
    public static int amrita(int a){
        if (a<7){
            return a;
        }
        else return 0; // else return statement compulsary hai!!
    }
}
