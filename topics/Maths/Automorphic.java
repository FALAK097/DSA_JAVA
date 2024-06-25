// Automorphic number is the number whose square ends with number itself
// Example -> 25 => 25 * 25 => 625 which ends with 25 so it is an automorphic number

public class Automorphic {
    public static void main(String[] args) {
        System.out.println(isAutomorphic(2));
    }

    static boolean isAutomorphic(int n) {
        int square = n * n;

        while (n > 0) {
            if (n % 10 != square % 10)
                return false;

            // divide the number and square to reduce it.
            n = n / 10;
            square = square / 10;
        }
        return true;
    }
}
