import java.util.Scanner;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " is " + sumOfN(n));
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }
}
