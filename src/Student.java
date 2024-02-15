import java.util.*;
public class Student {
    String firstName;
    String lastName;
    int id;
    int grade;

    public Student (String info) {
        Scanner s = new Scanner(info);
        firstName = s.next();
        lastName = s.next();
        id = s.nextInt();
        //grade = (int)((double)(s.next()) * 100);
    }
    private char getLetterGrade() {
        if (grade < 6000) {
            return 'F';
        } else {
            return (char)((int)'A' + (10000 - grade)/1000);
        }
    }
    public String toString() {
        return firstName + " " + lastName + " " + id + " " + grade + " " + getLetterGrade();
    }
}
