package classtest02;

/**
 * Created by sanjaysaha on 11/15/16.
 */
public abstract class Person {
    private String name;
    private int birthDay, birthMonth, birthYear;

    public void setName(String name) { this.name = name; }

    public void setBirthDay(int birthDay) {
        if (birthDay>1 && birthDay<=31)
            this.birthDay = birthDay;
    }

    public abstract void setBirthMonth(int birthMonth);
    public abstract void setBirthYear(int birthYear);

    public abstract String getAge(int currentDay, int currentMonth, int currentYear);
}
