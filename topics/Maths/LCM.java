public class LCM {
    public static void main(String[] args) {
        int a = 4, b = 8;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("The lcm is " + lcm);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
