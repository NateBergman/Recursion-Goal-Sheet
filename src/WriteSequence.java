//Write a recursive method called writeSequence that accepts an integer n as a parameter and prints to the console a symmetric sequence of n numbers composed of descending integers that ends in 1,
// followed by a sequence of ascending integers that begins with 1. When n is odd, the sequence has a single 1 in the middle, but when n is even, it has two 1s in the middle.
// Throw an IllegalArgumentException if it is passed a value less than 1. (BJP Ch 12 Ex 3)
public class WriteSequence {
    public static void main (String[] args) { //
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
    }
    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be at least 1");
        }
        System.out.print(n);
        if (n > 1) {
            writeSequence(n-1);
            System.out.print(n);
        }
    }
}
