import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.reverse3();
    }

    // 1. Using Algorithm
    public void reverse1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt(), rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
        sc.close();
    }

    // 2. Using StringBuffer
    public void reverse2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println("Reversed number: " + sb.reverse());
        sc.close();
    }

    // 3. Using StringBuilder
    public void reverse3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        System.out.println("Reversed number: " + sb.reverse());
        sc.close();
    }
}