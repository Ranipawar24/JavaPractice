package DSA1.Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        /*
         * we do a certain no. of passes/ iteration and in every passes we compare
         * adjacent elements and swap them if they are not in correct order.
         * 
         * In every iteration the largest no. in part of array to be process gets its
         * correct positions.
         */

        int[] a = { 7, 8, 4, 5, 3, 2 };
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

    }

    public static void bubbleSort(int[] a) {

        int n = a.length;
        // n-1 iterations

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are already at correct positions, so no need to check them

                if (a[j] > a[j + 1]) {
                    // swap a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }

        }

    }

}
