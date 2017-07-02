/**
 * Created by user on 6/20/2017.
 */
public class Student extends Person {
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

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + getFullName()+ '\'' +
                ", ID='" + ID + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}
