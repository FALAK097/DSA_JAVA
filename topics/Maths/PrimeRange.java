public class PrimeRange {
    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimesRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a = 2, b = 20;
        printPrimesRange(a, b);
    }
}
