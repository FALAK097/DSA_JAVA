import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println("GCD of " + n + " and " + m + " is " + calcGCDeuclidean(n, m));
        sc.close();
    }

    // 1. Basic Approach
    // Time Complexity: Worst Case: O(n)
    public static int calcGCD(int n, int m) {
        int i = 2, gcd = 1;

        while (i <= n && i <= m) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    // 2. Euclidean Algorithm states that, gcd(n, m) = gcd(m, n % m)
    // Time Complexity: Worst Case: O(log(min(n, m)))

    public static int calcGCDeuclidean(int n, int m) {
        if (m == 0) {
            return n;
        }
        return calcGCDeuclidean(m, n % m);
    }
}
