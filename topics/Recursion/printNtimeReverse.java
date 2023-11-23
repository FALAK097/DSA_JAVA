import java.util.Scanner;

public class printNtimeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print: ");
        int n = sc.nextInt();
        printNtimeshelper(n);
    }

    public static void printNtimeshelper(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNtimeshelper(n - 1);
    }
}