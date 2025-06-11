package Leetcode;

public class day4 {
  public static void main(String[] args) {
    // Fibonacci Number

    day4 obj = new day4();
    int result = obj.fib(7); // Example: F(7) = 13
    System.out.println(result);

  }

  public int fib(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    int firstTerm = 0;
    int secondTerm = 1;

    for (int i = 1; i <= n; i++) {
      int thirdTerm = firstTerm + secondTerm;

      firstTerm = secondTerm;
      secondTerm = thirdTerm;

    }
    return firstTerm;
    

  }
}
