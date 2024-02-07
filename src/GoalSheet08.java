//Write a method called removeInRange that accepts four parameters: a LinkedList, an element value, a starting index, and an editing index. The method’s behavior is to
//remove all occurrences of the given element that appear in the list between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences
//of the given value that appear outside the given index range are not affected.

//Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges the list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example, the list {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9} would become {-9, -5, 4, 7, 8, 11, 15, 27, 32} after a call to your method. Use a Set as part of your solution.

//Write a method removeEvenLength that accepts a set of strings as a parameter and that removes all of the strings of even length from the set

//Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value).
import java.util.*;
public class GoalSheet08 {
    public static void main (String[] args) {
        /*List<Character> list = new LinkedList<Character>();
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 26; i++) {
                list.add((char) ('a' + i));
            }
        }
        System.out.println(list);
        removeInRange(list, 'n', 10, 50);
        System.out.println(list);*/

        /*List<Integer> l = new LinkedList<Integer>();
        int[] array = new int[]{7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
        for (int i = 0; i < array.length; i++) {
            l.add(array[i]);
        }
        System.out.println(l);
        sortAndRemoveDuplicates(l);
        System.out.println(l);*/

        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("1234");
        set.add("12");
        set.add("12345");
        set.add("123456");
        set.add("123");
        System.out.println(set);
        removeEvenLength(set);
        System.out.println(set);
    }
    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            if (itr.next().length() % 2 == 0) {
                itr.remove();
            }
        }
    }
    public static void sortAndRemoveDuplicates (List<Integer> list) {
        Set<Integer> ts = new TreeSet<>(list);
        list.clear();
        list.addAll(ts);
    }
    public static void removeInRange (List<Character> list, char value, int start, int end) {
        Iterator<Character> itr = list.iterator();
        if (end > list.size()) {
            end = list.size();
        }
        if (start >= end) {
            start = end - 1;
        }
        int i = 0;
        for (i = i; i < start; i ++) {
            itr.next();
        }
        while (i < end) {
            char c = itr.next();
            if (c == value) {
                itr.remove();
            }
            i++;
        }
    }
}
