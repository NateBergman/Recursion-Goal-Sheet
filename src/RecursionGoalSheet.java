import java.util.Arrays;

public class RecursionGoalSheet { //recursion goal sheet by Nate Bergman
    public static void main (String[] args) {
        for (int i = 1; i < 11; i++) {
            writeSequence(i);
            System.out.println();
        }
    }
    public static void starString(int i) {
        if (i == 0) {
            System.out.print('*');
        } else {
            starString(i-1);
            starString(i-1);
        }
    }
    public static void writeNums(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            writeNums(n-1);
            System.out.print(n);
        }
    }
    public static void writeBadSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be at least 1");
        }
        System.out.print(n + " ");
        if (n > 1) {
            writeSequence(n-1);
            System.out.print(n + " ");
        }
    }

    public static void writeSequence (int n) {
        if (n > 0) {
            System.out.print(((n + 1) / 2) + " ");
            if (n > 1) {
                writeSequence(n - 2);
                System.out.print(((n + 1) / 2) + " ");
            }
        }
    }
    public static double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input a value of 0 or greater stupid");
        } else if (n == 0) {
            return 0;
        } else {
            return (1.0 / n) + sumTo(n - 1);
        }
    }
    public static int fibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("put in a positive number, you idiot");
        }
        return fibonacci(n - 1, 1, 0);
    }
    public static int fibonacci(int n, int prev1, int prev2) {
        if (n > 0) {
            return fibonacci(n - 1, prev1 + prev2, prev1);
        } else {
            return prev1;
        }
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
    public static void mergeSort(String[] array) {
        if (array.length > 1) {
            String[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
            String[] array2 = Arrays.copyOfRange(array, array.length / 2, array.length);

            mergeSort(array1);
            mergeSort(array2);

            int i1 = 0;
            int i2 = 0;
            while (i1 + i2 < array1.length + array2.length) {
                if (i2 >= array2.length || (i1 < array1.length && String.CASE_INSENSITIVE_ORDER.compare(array1[i1],array2[i2]) < 0)) {
                    array[i1 + i2] = array1[i1];
                    i1++;
                } else {
                    array[i1 + i2] = array2[i2];
                    i2++;
                }
            }
        }

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
}
