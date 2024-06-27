public class PowerOfFour {
    public static boolean powerOfFour(int num) {
        if (num <= 0)
            return false;

        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 16;
        System.out.println(powerOfFour(input) ? "true" : "false");
    }
}
