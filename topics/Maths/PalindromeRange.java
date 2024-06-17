public class PalindromeRange {
    public static void main(String args[]) {
        int min = 10;
        int max = 200;

        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int x) {
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
}
