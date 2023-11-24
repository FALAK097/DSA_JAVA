// Armstrong number is
// 153 = 1^3 + 5^3 + 3^3
// 1634 = 1^4 + 6^4 + 3^4 + 4^4

// 1. Count the number of digits in the number
// 2. Find the sum of the power of each digit
// 3. Compare the sum with the original number

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check if it's an Armstrong number or not :");
        int n = s.nextInt();
        if (ArmstrongNumber(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        s.close();
    }

    static boolean ArmstrongNumber(int n) {
        int originalno = n;
        int count = 0;
        int sumofpower = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        while (n != 0) {
            int digit = n % 10;
            sumofpower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumofpower == originalno);
    }
}
