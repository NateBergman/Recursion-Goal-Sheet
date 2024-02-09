//Write a method called partition that accepts a list of integers and an integer value E as its parameters, and rearranges (partitions) the list so that all elements with values less than E
// occur before all elements with values greater than E. The exact order of the elements is unimportant, so long as all elements less than E appear before all elements greater than E.
// (BJP Ch 11 Ex 4) (Make sure that if the partition value is in the list, the partition value appears between the list sections as many times as it is in the list.)

//Write a method called countUnique that accepts a list of integers as a parameter and returns the number of unique integer values in the list. Use a set as auxiliary storage to help you solve this problem.

//Write a method maxLength that accepts a set of strings as a parameter and that returns the length of the longest string in the list. If your method is passed an empty set, it should return 0.

//Write a method called rarest that accepts a map whose keys are strings and whose values are integers as a parameter and returns the integer value that occurs the fewest times in the map.
// If there is a tie, return the smaller integer value. If the map is empty, throw an exception
import java.lang.reflect.Array;
import java.util.*;
public class GoalSheet09 {
    public static void main (String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,6,5,3,8,5,3,7,3,8));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,6,5,3,8,5,3,7,3,8));
        partition(list1, 5);
        partition(list2, 5);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(countUnique(list1));
        System.out.println(countUnique(list2));

        Set<String> set1 = new HashSet<String>(Arrays.asList("123","1","12345","12"));
        System.out.println(maxLengh(set1));

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("hello",1);
        map.put("hi",3);
        map.put("lol",2);
        map.put("lala",1);
        map.put("fefifofum",3);
        System.out.print(rarest(map));
    }
    public static int rarest(Map<String,Integer> map) {
        Map<Integer,Integer> counts = new HashMap<Integer, Integer>();
        for (Integer i : map.values()) {
            if (counts.containsKey(i)) {
                counts.put(i,counts.get(i) + 1);
            } else {
                counts.put(i,1);
            }
        }
        int smallestCount = 99999;
        int smallestNum = -1;
        for (Integer i : counts.keySet()) {
            if (counts.get(i) < smallestCount) {
                smallestNum = i;
                smallestCount = counts.get(i);
            }
        }
        return smallestNum;
    }
    public static int maxLengh (Set<String> set) {
        int max = 0;
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            int i = itr.next().length();
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);
        return set.size();
    }
    public static void partition(ArrayList<Integer> list, int E) { //with AL, more efficient to set
        int x = 0; //represents the value placing smaller numbers at
        int y = list.size() - 1; //represents the value for greater numbers
        int i = 0; //traversal variable
        while (i <= y) {
            int v = list.get(i); //stores the value of considered space
            if (v > E) {
                list.set(i,list.get(y));
                list.set(y,v);
                y--;
            }
            else if (v < E) {
                list.set(i,list.get(x));
                list.set(x,v);
                x++;
                i++;
            }
            else {
                i++;
            }
        }
    }
    public static void partition(LinkedList<Integer> list, int E) { //with LL, more efficient to remove/add
        Iterator<Integer> itr = list.iterator();
        LinkedList<Integer> goodList = new LinkedList<Integer>();
        int i = 0;
        while (itr.hasNext()) {
            int v = itr.next();
            if (v < E) {
                goodList.add(0,v);
                i++;
            }
            else if (v > E) {
                goodList.add(v);
            } else {
                goodList.add(i,v);
                i++;
            }
        }
        list.clear();
        list.addAll(goodList);
    }
}
