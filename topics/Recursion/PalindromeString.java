import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(isPal(str, 0) ? "YES" : "NO");
    }

    public static boolean isPal(String str, int i) {
        int n = str.length();
        if (i == n / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return isPal(str, i + 1);
    }
}