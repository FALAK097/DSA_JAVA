// You are given number n
// Count the number of digits in n that are divisors of n
// Example: n = 12
// 12 has 2 digits 1 and 2
// 1 is a divisor of 12
// 2 is a divisor of 12
// So, the answer is 2

// Time Complexity is = O(logn)
// Space Complexity is O(logn)

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        countDigits(number);
    }

    // public static void countDigits(int number) {
    // String numStr = Integer.toString(number);
    // int count = 0;

    // for (int i = 0; i < numStr.length(); i++) {
    // int digit = Character.getNumericValue(numStr.charAt(i));
    // if (digit != 0 && number % digit == 0) {
    // count++;
    // }
    // }

    // System.out.println(count);
    // }

    public static void countDigits(int number) {
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
