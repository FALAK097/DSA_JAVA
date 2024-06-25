// Perfect number is the one whose sum of proper divisors (positive) excluding itself is equal to the number itself
// eg - 6 is a perfect number
// 1 + 2 + 3 => 6

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        // if (isPerfect(n)) {
        if (isPerfectOpt(n)) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }

    // Time complexity - O(N)
    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    // Time complexity - O(√N)
    static boolean isPerfectOpt(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n || i == 1) {
                    sum = sum + i;
                } else {
                    sum = sum + i + n / i;
                }
            }
        }
        if (sum == n)
            return true;
        else
            return false;
    }
}
