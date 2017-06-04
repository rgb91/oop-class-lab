/**
 * Created by sanjaysaha on 11/6/16.
 */
public class OrderTest {
    double var;

    {
        System.out.println(var);
        var *= 5;
    }

    public OrderTest(){
        System.out.println(var);
        var *= 2;
        System.out.println(var);
    }

    public OrderTest(double var) {
        this.var += var + 3.7;
        var *= 4;
        System.out.println(this.var);
    }

    {
        var += 0.8;
        System.out.println(var);
        var *= 3;
    }

    public static void main(String[] args) {
        OrderTest obj = new OrderTest(2.3);
    }
}
