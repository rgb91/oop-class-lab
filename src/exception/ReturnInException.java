package exception;

/**
 * Created by sanjaysaha on 12/13/16.
 */
public class ReturnInException {
    public void dummy() {
        System.out.println("bullshit");
    }

    public static int testMethod() {
        int a = 100;
        try {
            System.out.println("in try");
            return a;
        } catch (Exception e) {
            System.out.println("in catch");
        }
        return a;
    }

    public static void main(String[] args) {
        int a = testMethod();
        ReturnInException obj = null;
        obj.dummy();
        System.out.println(a);
    }
}
