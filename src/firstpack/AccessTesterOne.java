package firstpack;

/**
 * Created by sanjaysaha on 10/31/16.
 */
public class AccessTesterOne {
    public static void main(String[] args) {
        AccessObjectOne obj = new AccessObjectOne();
        System.out.println("From tester: "+obj.publicString);
        System.out.println("From tester: "+obj.protectedString);
        // Can't do the following
        // System.out.println("From tester: "+obj.privateString);
        obj.access();

    }
}
