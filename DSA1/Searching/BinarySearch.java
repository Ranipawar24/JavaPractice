package DSA1.Searching;

public class BinarySearch {

    // TIME COMPLEXCITY = O(LOG N)

    // prerequisite - sorted arrays

    // PSEUDO CODE
    /*
     * start= 0, end =-1
     * while(start<=end)
     * findmid
     * compare mid & key
     * mid== key Found
     * mid> key Left 1st half end update
     * mid< key Right 2nd half start update
     */
    public static void main(String[] args) {
        int num[] = { 2, 4, 8, 10, 12, 14, 18 };
        int key = 20;
        System.out.println("Index for key is : " + binarySearch(num, key));
        // 

    }

    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;

    }
}
