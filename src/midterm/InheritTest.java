package midterm;
/**
 * Created by akashs on 11/14/16.
 */

public class InheritTest {
    public static void main(String[] args) {
        A a = new A();
        D d = (D)a;
        d.print();
        B b = new D();
//        b.printExtra("abc");
        d = (D)b;
        d.print();
    }
}

class D extends A{
    public void printExtra(String s){
        System.out.println(s);
    }
    public void fun2(){
        System.out.println("Fun in D");
    }
}

class A extends B{
    public void print(){
        System.out.println("Enjoy");
    }
}

class B{
    public final void fun(){
        System.out.println("Fun in B");
    }
}
