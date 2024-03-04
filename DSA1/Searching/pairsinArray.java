package DSA1.Searching;

public class pairsinArray {
    public static void main(String[] args) {
        int num[] = { 2, 4, 8, 6, 7, 9 };
        printPairs(num);

    }

    public static void printPairs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }
}