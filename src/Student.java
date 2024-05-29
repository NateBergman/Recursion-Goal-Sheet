import java.util.*;
public class Student {
    String firstName;
    String lastName;
    int id;
    int grade;

    public Student (String info) {
        Scanner s = new Scanner(info);
        lastName = s.next();
        firstName = s.next();
        id = s.nextInt();
        grade = (int)(s.nextDouble() * 100);
    }
    private char getLetterGrade() {
        if (grade < 6000) {
            return 'F';
        } else {
            return (char)((int)'A' + (10000 - grade)/1000);
        }
    }
    public String toString() {
        return lastName + " " + firstName + " " + id + " " + (grade/100) + "." + (grade%100) + " " + getLetterGrade();
    }
    public int getGrade() {
        return grade;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return lastName;
    }
}
