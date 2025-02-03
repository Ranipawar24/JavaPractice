package Leetcode;

public class day2 {
    public static void main(String[] args) {
        day2 obj = new day2();
        System.out.println(obj.isPowerOfTwo(8));
        System.out.println(obj.isPowerOfTwo(10));

    }

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

}
