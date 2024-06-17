public class SumofDigits {
    public static void main(String[] args) {
        int number = 12345;
        // 1 + 2 + 3 + 4 + 5 = 15
        System.out.println("The sum of " + number + " is " + sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
