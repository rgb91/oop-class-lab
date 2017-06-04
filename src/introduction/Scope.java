/**
 * Created by swakkhar on 5/10/16.
 */
public class Scope
{
    public static void main(String args[])
    {
        int x; // known to all code within main
        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        System.out.println("x is " + x);
        for(x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
        {
            int y=10;
            // int x=10;  <- can not do this compilation error
        }
        // System.out.println(y); <- can not do this compilation error
    }
}

