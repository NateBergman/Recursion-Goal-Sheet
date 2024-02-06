//Write a recursive method called sumTo that accepts an integer parameter n and returns a real number representing the sum of the first
// n reciprocals. In other words, sumTo(n) returns (1 + ½ + 1/3 + ¼ + … + 1/n). For example, sumTo(2) should return 1.5. The method should return
// 0.0 if it is passed the value 0 and throw an IllegalArgumentException if it passed a value less than 0. (BJP Ch 12 Ex 9)
public class SumTo {
    public static void main (String [] args) {
        System.out.println(sumTo(0));
        System.out.println(sumTo(1));
        System.out.println(sumTo(2));
        System.out.println(sumTo(3));
        System.out.println(sumTo(4));
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
}
