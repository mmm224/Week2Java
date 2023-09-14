package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid; // only between class we can use this string

    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid);
        this.studentid = studentid;
    }
}
