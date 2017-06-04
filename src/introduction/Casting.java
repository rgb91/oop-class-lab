package introduction;

/**
 * Created by swakkhar on 5/10/16.
 */
public class Casting
{
    public static void main(String args[])
    {
        byte b;
        int i = 254;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

        b = 42;
        char c = 'a';
        short s = 1024;
        i = 50000;
        float f = 5.67f;
        d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    } // end of main
}// end of Casting class
