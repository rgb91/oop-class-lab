/**
 * Created by sanjaysaha on 10/31/16.
 */
public class PackUsageOne {
    public static void main(String[] args) {
        firstpack.secondpack.AccessObjectTwo obj =
                new firstpack.secondpack.AccessObjectTwo();
        System.out.println("From a class outside package: "
                + obj.getPrivateString());
    }
}
