public class PrimeNumber {

    // Approach - 01 Brute force

    /*
     * static boolean isPrime(int n) {
     * int cnt = 0;
     * 
     * for(int i = 1; i<= n; i++) {
     * if(n % i == 0) cnt ++;
     * }
     * 
     * if(cnt == 2) return true;
     * return false;
     * }
     */

    // Approach - 02 Optimized
    static boolean checkPrime(int n) {
        int cnt = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
                // If n is not a perfect square, count its reciprocal factor.
                if (i != n / i) {
                    cnt = cnt + 1;
                }
            }
        }
        if (cnt == 2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(" " + n + " is a prime number.");
        } else {
            System.out.println(" " + n + " is not a prime number.");
        }
    }
}