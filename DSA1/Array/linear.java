package DSA1.Array; // its a folder which my java files lies

import java.util.Scanner;

public class linear {
    // defining array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        // marks[0] = 85;// phy

        // marks[1] = 89;// math
        // marks[2] = 90;// sci
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // input using for loop

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i] + " ");
        // }

        // input using foreach loop
        for (int num : marks) { // for every element in the marks , print the marks
            System.out.print(num + " "); // here num represents element of the marks
        }

    }

}
