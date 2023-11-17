// Armstrong number is
// 153 = 1^3 + 5^3 + 3^3
// 1634 = 1^4 + 6^4 + 3^4 + 4^4

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        armstrong(num);
        sc.close();
    }

    public static void armstrong(int num) {
        int orgNum = num;
        int sum = 0;
        int numOfDigits = countDigits(num);

        while (num > 0) {
            int last_digit = num % 10;
            sum = sum + (int) Math.pow(last_digit, numOfDigits);
            num = num / 10;
        }

        System.out.println(sum == orgNum);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
