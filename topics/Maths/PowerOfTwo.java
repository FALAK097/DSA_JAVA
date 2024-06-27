public class PowerOfTwo {
    public static boolean powerOfTwo(int num) {
        if (num <= 0)
            return false;

        while (num > 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 16;
        System.out.println(powerOfTwo(input) ? "true" : "false");
    }
}
