package DSA1.Array.problems;

public class question3 {

    // Reverse an array consisting of integer values?

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4, 6 };
        int ans[] = reverseArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");

        }

    }

    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        // traverse oroginal array in reverse direction

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];

        }
        return ans;


    }

}
