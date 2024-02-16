
/*
    Time Complexity: O(n)

    Space Complexity: O(1)

    Where 'n' is the given integer.
*/
import java.util.Scanner;

public class SumofDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // Check if i is a divisor of num
                sum += i; // Add i to the sum
            }
        }

        System.out.println("Sum of divisors of " + num + " is " + sum);
        sc.close();
    }
}
