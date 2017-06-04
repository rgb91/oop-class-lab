package midterm;

/**
 * Created by sanjaysaha on 11/28/16.
 */
public class InheritTest2 {
}

class Parent {
    protected int x;
    protected int y;
    public Parent(int a, int b) {
        x=a;
        y=b;
    }
}

class Child extends Parent {
    private int z;
    public Child(int a, int b, int c) {
        super(a,b);
        x=a;
        y=b;
        z=c;
    }
}