import java.util.*;
public class StudentComparator implements Comparator<Student> {
    public enum CompareMode {
        NAME,ID,GRADE;
    }
    CompareMode mode;
    public StudentComparator(CompareMode mode) {
        this.mode = mode;
    }
    public int compare (Student s1, Student s2) {
        if (mode == CompareMode.NAME) {
            return String.CASE_INSENSITIVE_ORDER.compare(s1.getName(),s2.getName());
        } else if (mode == CompareMode.ID) {
            return s1.getID() - s2.getID();
        } else {
            return s2.getGrade() - s1.getGrade();
        }
    }
}
