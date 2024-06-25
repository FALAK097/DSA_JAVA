// Geometric Progression :-
// a - first term
// r - common ratio
// n - number of terms
// GP = a(r^n - 1) / (r - 1)
// which is => a + ar^1 + ar^2 + ar^3 ...

public class SumOfGP {
    public static void main(String[] args) {
        double a = 1, r = 0.5;
        int n = 3;
        System.out.println(calcGP(a, r, n));
    }

    static double calcGP(double a, double r, int n) {
        double gp = 0.0;

        for (int i = 0; i < n; i++) {
            gp += a;
            a *= r;
        }
        return gp;
    }
}
