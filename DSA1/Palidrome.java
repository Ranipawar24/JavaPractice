package DSA1;

public class Palidrome {
    // check if number is palindrome
    public static void main(String[] args) {
        int n = 454;
        int rev = 0;
        int num = n;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;

        }
        System.out.println(rev == n);

    }

}
