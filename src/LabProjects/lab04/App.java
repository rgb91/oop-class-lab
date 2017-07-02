import java.util.Scanner;

/**
 * Created by user on 6/20/2017.
 */
public class App {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Faculty teacher = new Faculty("Sanjay", "Saha");
        System.out.println(teacher.getFullName());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {

            String f   = sc.next();
            String l   = sc.next();
            String id  = sc.next();
            double cg  = sc.nextDouble();

            students[i] = new Student(f, l, id, cg);
//            System.out.println(students[i].getFirstName());
        }
        for (int i = 0; i < n; i ++) {
            System.out.println(students[i]);
        }
    }
}
