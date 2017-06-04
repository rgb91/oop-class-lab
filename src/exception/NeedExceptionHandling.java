package exception;

/**
 * Created by sanjaysaha on 12/14/16.
 */
public class NeedExceptionHandling {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);

        NeedExceptionHandling obj = null;
        obj.printOutput(a1/a2);
    }

    public void printOutput(int output) {
        System.out.println(output);
    }
}
