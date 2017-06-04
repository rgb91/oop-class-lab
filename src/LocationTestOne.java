/**
 * Created by sanjaysaha on 11/6/16.
 */

public class LocationTestOne {

    public static void main(String[] args) {
        Location dhaka = new Location(23.8, 90.4);
        Location unknown = dhaka;
        unknown.setLongitude(77.5);
        System.out.println(dhaka);
    }
}
