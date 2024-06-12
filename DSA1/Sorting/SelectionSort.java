package DSA1.Sorting;

public class SelectionSort {
    public static void main(String[] args) { // Time complexcity = O(n²)

        int[] arr = { 7, 4, 5, 1, 2 };
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represents the current index
            int min_index = i;
            // find the min index of unsorted part of the array
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;

                }

            }

            // swap curr element and min element - curr index i will have correct element

        }

    }

}
