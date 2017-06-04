/**
 * Created by sanjaysaha on 11/6/16.
 */
public class LocationTestTwo {

    public static void changeLatitude(Location l) {
        l.setLatitude(59.0);
    }

    public static void changeReference(Location l) {
        l = new Location();
        l.setLatitude(28.0);
        l.setLongitude(66.2);
    }

    public static void main(String[] args) {
        Location loc = new Location();
        System.out.println(loc);
        changeLatitude(loc);
        System.out.println(loc);
        changeReference(loc);
        System.out.println(loc);
    }
}
