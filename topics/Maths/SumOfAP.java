// AP - Arithmetic Progression
// a - first term
// d - common difference
// n - number of terms

// n = 4, a = 2, d = 2
// output = 20 -> 2 + 4 + 6 + 8

public class SumOfAP {
    public static void main(String[] args) {
        int n = 8, a = 2, d = 5;
        System.out.println(calcAP(n, a, d));
    }

    static int calcAP(int n, int a, int d) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a;
            a += d;
            // sum += a + (i * d);
        }
        return sum;
    }
}
