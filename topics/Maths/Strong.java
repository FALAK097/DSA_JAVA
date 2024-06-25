// Strong number -> When the sum of factorial of individual digits is equal to the original number, the number is strong number.

public class Strong {
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int strong(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 145;
        int ans = strong(n);

        if (ans == n && n != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
