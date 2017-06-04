import firstpack.AccessObjectOne;

/**
 * Created by sanjaysaha on 10/31/16.
 */
public class AccessTesterTwo {
    public static void main(String[] args) {
        AccessObjectOne obj = new AccessObjectOne();

        System.out.println(obj.publicString);
        // Can't do this
        // System.out.println(obj.protectedString);

    }
}
