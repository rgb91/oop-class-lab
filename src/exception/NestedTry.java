package exception;

/**
 * Created by sanjaysaha on 12/4/16.
 */
public class NestedTry {
    public static void main(String[] args) {
        int students[] = new int[5];
        try {
            System.out.println("Start Try");
            try {
                System.out.println("Start Change");
                students[10]=1;
                System.out.println("End Change");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Change Catch: " + e.getMessage());
            }
            System.out.println("After Change");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Main Catch: "+ex.getMessage());
        }
        System.out.println("After Try");
    }
}
