
// Use originalNumber bcz 
// if we use x then x will be 0 after while loop
// and we will not be able to compare it with originalNumber
import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNumber = x;
        int reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        return originalNumber == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(number));
        sc.close();
    }
}