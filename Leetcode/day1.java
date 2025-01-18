package Leetcode;

public class day1 {
    public static void main(String[] args) {
        day1 obj = new day1(); // Create an object to call the isPalindrome method
        int testNumber = 121; // Example number to test
        boolean result = obj.isPalindrome(testNumber); // Call the method
        System.out.println(result); // Print the result
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;

        }
        int n = x;
        int revNum = 0;
        while (n > 0) {
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n = n / 10;

        }
        if (revNum == x) {
            return true;
        } else {
            return false;
        }

    }
}
