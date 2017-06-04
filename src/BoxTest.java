import java.util.Scanner;

/**
 * Created by sanjaysaha on 11/4/16.
 */
public class BoxTest {
    public static void main(String[] args)
    {
        Box[] mybox = new Box[10];
        for(int i=0; i<=mybox.length; i++)
        {
            mybox[i] = new Box();
            System.out.println("Enter Height: ");
            Scanner sc1 = new Scanner(System.in);
            mybox[i].height = sc1.nextDouble();
            System.out.println("Enter Width: ");
            Scanner sc2 = new Scanner(System.in);
            mybox[i].width = sc1.nextDouble();
            System.out.println("Enter Depth: ");
            Scanner sc3 = new Scanner(System.in);
            mybox[i].depth = sc1.nextDouble();
        }

        for(int j=0; j<=mybox.length; j++)
        {
            System.out.println("Volume of: "+j+"Is: "+mybox[j].volume());
        }
    }
}
