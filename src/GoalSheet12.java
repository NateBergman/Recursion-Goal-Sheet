//Write code to read a dictionary from a file, then prompt the user for two words and tell the user how many words in the dictionary fall between those two words.
// Use (implement) the binary search algorithm in your solution.

//Write a Comparator that compares Point objects by their distance from the origin (0,0). Points that are closer to the origin are considered to come before those which are further from the origin.

//Write a modified “dual” version of the selection sort algorithm that selects both the largest and smallest elements on each pass and moves each of them to the appropriate end of the array.
// Will this algorithm be faster than the standard selection sort? What predictions would you make about its performance relative to the merge sort algorithm? What would its complexity class be O()?

//Write a program that processes a data file of students’ grade data. The data arrive in random order; each line stores information about a student’s last name, first name, student ID number,
//grade as a percentage, and letter grade. (See example table.) You should be able to sort the data by any of the columns.
//Use Comparators to achieve the sort orderings. Make the data sortable by last name, student ID, and grade percentage in ascending and descending order.
import java.util.*;
import java.io.*;
import java.awt.*;
public class GoalSheet12 {
    public static void main(String[] args) throws FileNotFoundException {
        //dictionary stuff
        Scanner console = new Scanner(System.in);

        /*System.out.print("Word 1 : ");
        String word1 = console.next();
        System.out.print("Word 2 : ");
        String word2 = console.next();
        System.out.print(distance(word1,word2));*/

        /*Point p1 = new Point(3,4);
        Point p2 = new Point(4,3);
        Point p3 = new Point(7,0);
        PointComparator p = new PointComparator();
        System.out.println(p.compare(p1,p2));
        System.out.println(p.compare(p2,p3));
        System.out.println(p.compare(p3,p1));*/

        int[] array1 = new int[] {1,8,7,5,3,8,-5,32,39,-2};
        System.out.println(Arrays.toString(array1));
        dualSelectionSort(array1);
        System.out.println(Arrays.toString(array1));
    }
    public static void dualSelectionSort (int[] array) { //still order n squared, but makes half as many quick passes in exchange for more if tests. I would guess just a little faster
        int j = array.length - 1; //i is bottom bound, j is top bound, k is current index, v is current value
        for (int i = 0; i < j; i++)
        {
            int max = array[i];
            int min = array[i];
            int maxIndex = i;
            int minIndex = i;

            for (int k = i + 1; k <= j; k++) {
                int v = array[k];
                if (v < min) {
                    min = v;
                    minIndex = k;
                } else if (v > max) {
                    max = v;
                    maxIndex = k;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;
            array[maxIndex] = array[j];
            array[j] = max;

            j--;
        }
    }
    public static int distance (String word1, String word2) throws FileNotFoundException {
        Scanner file = new Scanner(new File("src/dictionarySorted.txt"));
        ArrayList<String> dictionary = new ArrayList<String>();
        while (file.hasNextLine()) {
            dictionary.add(file.nextLine());
        }
        return Collections.binarySearch(dictionary, word1) - Collections.binarySearch(dictionary, word2);
    }
}
