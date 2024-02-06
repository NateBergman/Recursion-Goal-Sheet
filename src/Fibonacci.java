public class Fibonacci {
    public static void main (String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(33));
        System.out.println(fibonacci(48));
        System.out.println(fibonacci(49));
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

    /*public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n – 1) + fib(n - 2);
        }*/
}
