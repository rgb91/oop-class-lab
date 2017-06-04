package nested;

/**
 * Created by sanjaysaha on 12/15/16.
 */
public class OuterClass {
    // all subclasses have access to these classes
    public class PublicInner {
        public PublicInner(){}
        public int a = 10;
    }
    protected class ProtectedInner {}

    // subclasses in the same package have access to this class
    class PackagePrivateInner {}

    // subclasses do not have access to this class
    private class PrivateClass {}
}
