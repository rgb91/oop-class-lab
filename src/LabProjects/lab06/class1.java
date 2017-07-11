/**
 * Created by user on 7/9/2017.
 */

interface Volume
{
    double getVol();
    void dummy();
}

interface Periphery
{
    double getPeriphery();
}


abstract class Shape implements Volume, Periphery{
    public void dummy () {
        System.out.println("dummy");
    }
}

class Cylinder extends Shape
{
    double rad;
    double height;

    Cylinder(double r, double h)
    {
        rad = r;
        height = h;
    }

    public double getVol() {
        return 1;
    }

    public double getPeriphery() {
        return 1;
    }

}

//class Cone implements Volume
//{
//    double rad;
//    double height;
//
//    Cone(double r, double h)
//    {
//        rad = r;
//        height = h;
//    }
//
//    public double getVol()
//    {
//        return 0.33 * 3.14 * rad * height;
//    }
//}
//
//class Sphere implements Volume
//{
//    double rad;
//    //double height;
//
//    Sphere(double r, double h)
//    {
//        rad = r;
//       // height = h;
//    }
//
//    public double getVol()
//    {
//        return 1.33 * rad * rad * rad;
//    }
//}
