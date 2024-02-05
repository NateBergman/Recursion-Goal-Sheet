//Write a recursive method called writeNums that takes an integer n as a parameter and prints to the console the first n integers starting with 1 in sequential order,
// separated by commas.
public class WriteNums {
    public static void main (String[] args) {
        writeNums(0);
        writeNums(1);
        writeNums(2);
        writeNums(3);
        writeNums(4);
        writeNums(5);
        writeNums(6);
    }
    public static void writeNums(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            writeNums(n-1);
            System.out.print(n);
        }
    }
}
