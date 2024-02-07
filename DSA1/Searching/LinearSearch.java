package DSA1.Searching;

public class LinearSearch {
    // 1. Search the array: return the index if item found otherwise if item not
    // found return -1
    public static void main(String[] args) {
        // TIME COMPLEXCITY = O(N)
        // SPACE COMPLEXCITY = O(1)
        int[] num = { 1, 25, 23, 2, 4, 8 };
        int target = 20;
        int index = LinearSearch1(num, target);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index: " + index);
        }

    }

    public static int LinearSearch1(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;

    }

}
