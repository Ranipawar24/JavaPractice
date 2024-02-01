package DSA1.Array;

import java.util.Arrays;

// ARRAYS IS MUTTABLE BECAUSE ITS CHANGEING OBJECTS
//The String is immutable, so its value cannot be changed.
public class PassinginFunctions {
    public static void main(String[] args) {
        int nums[] = { 2, 8, 78, 63 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int arr[]) {
        arr[0] = 85;
    }
}
