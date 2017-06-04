/**
 * Created by sanjaysaha on 11/6/16.
 */
public class StaticInitBlock {
    public static int var = 0;

    static {
        setVar(13);
        System.out.println("Inside static block");
    }

    public static void setVar(int var) {
        StaticInitBlock.var = var;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
