package Leetcode;

public class day3 {
    // Q 3.Fibonacci Number ?
    public static void main(String[] args) {
        day3 obj = new day3();
        System.out.println(obj.fib(10));

    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int firstTerm = 0;
        int secTerm = 1;

        for (int i = 1; i <= n; i++) {
            int thirdTerm = firstTerm + secTerm;
            firstTerm = secTerm;
            secTerm = thirdTerm;

        }
        return firstTerm;

    }

}
