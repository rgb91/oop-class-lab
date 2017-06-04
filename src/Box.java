/**
 * Created by sanjaysaha on 11/4/16.
 */
public class Box {
    double height;
    double width;
    double depth;

    Box (double h, double w, double d)
    {
        height = h;
        width = w;
        depth = d;
    }

    public Box() {
    }

    public double volume()
    {
        return  height*width*depth;
    }
}
