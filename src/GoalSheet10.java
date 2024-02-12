//Write a recursive method called writeSquares that accepts an integer parameter n and prints the first n squares separated by commas, with the odd squares in descending order followed by the even squares in ascending order.
// For example, writeSquares(8); prints the following output: 49, 25, 9, 1, 4, 16, 36, 64

//Write a modified version of the selection sort algorithm that selects the largest element each time and moves it to the end of the array, rather than selecting the smallest element and moving it to
// the beginning. Will this algorithm be faster than the standard selection sort? What will its complexity class (big-O) be?

import java.util.Arrays;

//Write a program that reads a series of input lines and sorts them into alphabetical order, ignoring the case of words. The program should use the merge sort algorithm so that it efficiently sorts even a large file.
public class GoalSheet10 {
    public static void main (String[] args) {
        for (int i = 1; i < 9; i++) {
            writeSquares(i);
            System.out.println();
        }
        for (int i = 1; i < 9; i++) {
            writeSquaresSameOrder(i,true);
            System.out.println();
        }
        /*
        int[] array1 = new int[] {1,8,7,5,3,8,-5,32,39,-2};
        System.out.println(Arrays.toString(array1));
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));
        */
    }
    public static void selectionSort(int[] array) { //selection sort with n squared efficiency
        for (int i = array.length - 1; i >= 0; i--) {
            int maxValue = array[0];
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > maxValue) {
                    maxIndex = j;
                    maxValue = array[j];
                }
            }
            array[maxIndex] = array[i];
            array[i] = maxValue;
        }
    }
    public static void writeSquaresSameOrder(int n) {
        if (n > 0) {
            System.out.print(n*n + " ");
            writeSquaresSameOrder(n-2);
        }
    }
    public static void writeSquaresSameOrder(int n, boolean first) {
        writeSquaresSameOrder((n / 2 + n % 2) * 2 - 1);
        writeSquaresSameOrder(n / 2 * 2);
    }
    public static void writeSquares(int n) {
        if (n > 0) {
            if (n % 2 == 0) { //if even
                writeSquares(n-1);
                System.out.print(n*n + " ");
            } else { //if odd
                System.out.print(n*n + " ");
                writeSquares(n-1);
            }
        }
    }
}
