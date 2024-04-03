import java.util.Scanner;

public class PowerOfTwo {
    public static int powerOfTwo(int num) {
        return (num & (num - 1)) == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(powerOfTwo(input) == 0 ? "false" : "true");
        sc.close();
    }

    public static int powerOfTwo2(int num) {
        if (num == 1)
            return 1;
        if (num < 1)
            return 0;

        while (num > 1) {
            if (num % 2 != 0)
                return 0;
            num = num / 2;
        }
        return 1;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(powerOfTwo(input) == 1 ? "true" : "false");
        sc.close();
    }
}
