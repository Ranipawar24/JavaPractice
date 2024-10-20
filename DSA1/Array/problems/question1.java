package DSA1.Array.problems;

public class question1 {
    // 1. Given 2 integers a and b. swap the given values using temporary variables?

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = { 1, 2, 3, 4, 5 };
        swap(a, b);

    }

    public static void swap(int a, int b) {
        System.out.println("Values before swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        int temp = a; // 9

        a = b;
        b = temp;
        System.out.println("Values After swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

}
