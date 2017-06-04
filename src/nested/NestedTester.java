package nested;

/**
 * Created by sanjaysaha on 12/15/16.
 */
public class NestedTester {
    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
        OuterClass.PublicInner publicInner = new OuterClass().new PublicInner();
    }
}
