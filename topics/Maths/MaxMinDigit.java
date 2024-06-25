public class MaxMinDigit {
    public static void main(String[] args) {
        int n = 4726;
        MinMax(n);
    }

    static void MinMax(int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (n != 0) {
            int d = n % 10;
            min = Math.min(min, d);
            max = Math.max(max, d);
            n = n / 10;
        }
        System.out.println("The greatest digit of the number is: " + max);
        System.out.println("The smallest digit of the number is: " + min);
    }
}
