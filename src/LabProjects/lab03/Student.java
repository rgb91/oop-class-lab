/**
 * Created by user on 6/13/2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String ID;
    private double CGPA;

    public Student(String firstName,
                   String lastName, String ID,
                   double CGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.CGPA= CGPA;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    private String getFullName() {
        return firstName+' '+lastName;
    }

    private int getFullName(String customFirstName,
                               String customLastName) {
        return 5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + getFullName("abc", "efg")+ '\'' +
                ", ID='" + ID + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}
