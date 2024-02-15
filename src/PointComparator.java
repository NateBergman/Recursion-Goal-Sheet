import java.awt.*;
import java.util.*;

public class PointComparator implements Comparator<Point> {
    public int compare (Point p1, Point p2) {
        double d1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        double d2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        return (int)(d1-d2);
    }
}
