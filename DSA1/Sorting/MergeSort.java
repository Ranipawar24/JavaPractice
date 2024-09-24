package DSA1.Sorting;

public class MergeSort {
    // Divide and Conquer methode
    // divide the array into 2 equal halves
    // sort the 2 subarrays seperately using recursion
    // merge the 2 sorted subarray to create an overall sorted arrays.
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 6 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part
        mergeArray(arr, si, mid, ei);
    }

    public static void mergeArray(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// index of first sorted arr
        int j = mid + 1;// index of second sorted arr
        int k = 0;// index of temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy to original arr.
        for (i = si; i <= ei; i++) {
            arr[i] = temp[i - si];
        }
    }

    // public static void main(String[] args) {
    // int[] arr = { 4, 1, 3, 5, 2 };
    // int n = arr.length;
    // System.out.println("Array before sorting");
    // displayArr(arr);
    // mergeSort(arr, 0, n - 1);
    // System.out.println("Array after sorting");
    // displayArr(arr);

    // }

    // public static void merge(int[] arr, int l, int mid, int r) {
    // int n1 = mid - l + 1;
    // int n2 = r - mid;
    // int[] left = new int[n1];
    // int[] right = new int[n2];
    // int i, j, k;
    // for (i = 0; i < n1; i++)
    // left[i] = arr[l + i];
    // for (j = 0; j < n2; j++)
    // right[j] = arr[mid + 1 + j];
    // i = 0;
    // j = 0;
    // k = l;

    // }

    // public static void mergeSort(int[] arr, int l, int r) {
    // if (l >= r)
    // return;
    // int mid = (l + r) / 2;
    // mergeSort(arr, l, mid);
    // mergeSort(arr, mid + 1, r);
    // merge(arr, l, mid, r);

    // }

    // public static void displayArr(int[] arr) {
    // for (int val : arr) {
    // System.out.println(val + " ");
    // }
    // }

}
