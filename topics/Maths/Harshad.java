// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

public class Harshad {
    public static void main(String[] args) {
        int n = 378;
        isHarshad(n);
    }

    static void isHarshad(int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }

        if (n % sum == 0) {
            System.out.println("Yes it is a harshad number");
        } else {
            System.out.println("No it is not a harshad number");
        }
    }
}
