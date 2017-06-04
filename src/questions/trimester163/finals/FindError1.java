package questions.trimester163.finals;

/**
 * Created by sanjaysaha on 12/28/16.
 */
class Super {
    void show() throws ArithmeticException, Exception {
        System.out.println("parent class");
    }
}

public class FindError1 extends Super {
    void show() throws Exception {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        try {
            Super s = new FindError1();
            s.show();
        } catch (Exception e) {
        }
    }
}
