package DSA1.Searching;

public class largestNumlinear {
    public static void main(String[] args) {
        int num[] = { 1, 33, 5, 8, 6, 9 };
        System.out.println("largest value is : " + getLargest(num));

    }

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }
}
