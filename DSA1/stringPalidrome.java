package DSA1;

public class stringPalidrome {
    // check if string is palindrome
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}
