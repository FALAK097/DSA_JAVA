// Example 1:
// Input: 18
// Output: 21
// Explanation: Next palindrome number is 21. 

import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The next palindrome number for " + num + " is " + nextPalindrome(num));
        sc.close();
    }

    public static int nextPalindrome(int num) {
        num++;

        while (!isPalindrome(num)) {
            num++;
        }
        return num;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return (original == reversed);
    }
}
