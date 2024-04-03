public class PowerOfFour {
    public static boolean powerOfFour(int num) {
        if (num <= 0)
            return false;

        double power = Math.log(num) / Math.log(4);
        return Math.pow(4, (int) power) == num;
    }

    public static void main(String[] args) {
        int input = 16;
        System.out.println(powerOfFour(input) ? "true" : "false");
    }
}
