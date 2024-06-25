public class AddTwoFraction {
    public static void main(String[] args) {
        int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
        // calculate the lcm by multiplying both the denominators and dividing by the
        // gcd
        int lcm = (den1 * den2) / _gcd(den1, den2);

        den3 = lcm;

        // changing the numerators to have same denominators and then adding them
        num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
        simple(num3, den3);

        System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + num3 + "/" +
                den3);
    }

    // Calculate the GCD using ecludiean algorithm
    static int _gcd(int a, int b) {
        if (b == 0)
            return a;

        return _gcd(b, a % b);
    }

    // dividing the num & den by gcd to get the fraction number in simplest form.
    static void simple(int num3, int den3) {
        int gcd = _gcd(num3, den3);

        num3 /= gcd;
        den3 /= gcd;
    }
}
