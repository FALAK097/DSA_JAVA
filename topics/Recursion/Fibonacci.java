// Time Complexity -
// 1. Recursive - O(2^n)
// 2. Memoization - O(n)

// Space Complexity -
// 1. Recursive - O(n)
// 2. Memoization - O(n)

// Using DP TC can be reduced

// Recursive
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
