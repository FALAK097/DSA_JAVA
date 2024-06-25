public class SumOfNatural {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(calcNaturalNumber(num));
    }

    static int calcNaturalNumber(int num) {
        int ans = 0;

        for (int i = 0; i <= num; i++) {
            ans = ans + i;
        }
        return ans;
    }
}
