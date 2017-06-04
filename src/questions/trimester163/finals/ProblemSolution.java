package questions.trimester163.finals;

/**
 * Created by sanjaysaha on 1/15/17.
 */
public class ProblemSolution {
    public int num;

    public ProblemSolution(int num) {
        this.num = num;
    }

    public void outerFun() {
        System.out.println(new Inner("xyz").name);
        new Inner("efg").innerFun();
    }

    public class Inner {
        public String name;

        public Inner (String name) {
            this.name=name;
        }

        public void innerFun() {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        new ProblemSolution(5).new Inner("abc").innerFun();
    }
}
