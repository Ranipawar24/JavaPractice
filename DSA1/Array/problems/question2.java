package DSA1.Array.problems;

public class question2 {
    // 2. Given 2 integers a and b. swap the 2 given values using sum and difference
    // method?
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = { 1, 2, 3, 4, 5 };

        swapWithoutTemp(a, b);

    }

    static void swapWithoutTemp(int a, int b) {
        System.out.println("Values before swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values After swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

}
