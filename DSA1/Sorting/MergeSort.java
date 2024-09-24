package DSA1.Sorting;

public class MergeSort {
    // Divide and Conquer methode
    // divide the array into 2 equal halves
    // sort the 2 subarrays seperately using recursion
    // merge the 2 sorted subarray to create an overall sorted arrays.
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 5, 2 };
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        mergeSort(arr, 0, n - 1);
        System.out.println("Array after sorting");
        displayArr(arr);

    }

    public static void mergeSort(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

    }

    public static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.println(val + " ");
        }
    }

}
