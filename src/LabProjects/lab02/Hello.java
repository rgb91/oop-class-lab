import java.util.Scanner;

/**
 * Created by user on 6/6/2017.
 */
public class Hello {
    public static void main (String xyz[]) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.firstName = "Mr. ";
        s1.lastName = "Rahim";
        s1.cgpa=sc.nextFloat();
        sc.next();
        String fullName = s1.getFullName();
    }
}
