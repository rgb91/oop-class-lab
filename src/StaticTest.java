/**
 * Created by sanjaysaha on 11/6/16.
 */
public class StaticTest {
    public static int count = 0;

    public StaticTest(){
        count++;
    }

    public static int getCount() { return count; }

    public static void main(String[] args) {
        System.out.println("Count from CLASS: "+StaticTest.count);
        StaticTest ob1 = new StaticTest();
        StaticTest ob2 = new StaticTest();
        StaticTest ob3 = new StaticTest();
        System.out.println("Count from CLASS: "+StaticTest.count);
        System.out.println("Count from OBJECT 3: "+ob3.count);
        ob1.count += 10;
        System.out.println("Count from OBJECT 2: "+ob2.count);
        System.out.println("Count from Static Method of CLASS: "+StaticTest.getCount());
        System.out.println("Count from Static Method of OBJECT: "+ob1.getCount());
    }
}
