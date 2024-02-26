package DSA1.Searching;

public class ReverseanArray {
    public static void main(String[] args) {
        int num[] = { 2, 4, 8, 10, 9 };
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }

    }

    public static void reverse(int num[]) {
        int start = 0, end = num.length - 1;

        while (start < end) {
            // swapping
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;

        }
    }
}
