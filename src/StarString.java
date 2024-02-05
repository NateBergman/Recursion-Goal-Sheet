//Write a recursive method called starString that accepts an integer as a parameter and prints to the console a string of stars (asterisks) that is 2n (i.e.2 to the nth power) long
public class StarString {
    public static void main (String[] args) {
        starString(0);
        System.out.println();
        starString(1);
        System.out.println();
        starString(2);
        System.out.println();
        starString(3);
        System.out.println();
        starString(4);
        System.out.println();
        starString(5);
        System.out.println();
        starString(6);
        System.out.println();
    }
    public static void starString(int i) {
        if (i == 0) {
            System.out.print('*');
        } else {
            starString(i-1);
            starString(i-1);
        }
    }
}
