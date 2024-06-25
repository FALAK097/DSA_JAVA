public class ZeroWithOne {
    public static void main(String[] args) {
        int n = 204;
        System.out.println(replaceZerosWithOnes(n));
    }

    /*
     * static int replaceZerosWithOnes(int num) {
     * String numStr = String.valueOf(num);
     * 
     * numStr = numStr.replace('0', '1');
     * 
     * return Integer.parseInt(numStr);
     * }
     */

    static int replaceZerosWithOnes(int num) {
        if (num == 0)
            return 1;

        int ans = 0;
        int temp = 1;

        while (num > 0) {
            int d = num % 10;
            if (d == 0)
                d = 1;

            // to form a number
            ans = d * temp + ans;
            // to discard the last digit
            num = num / 10;
            temp = temp * 10;
        }
        return ans;
    }
}
