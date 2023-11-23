import java.util.Scanner;

public class printNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print: ");
        int n = sc.nextInt();
        printNtimeshelper(1, n);
        sc.close();
    }

    public static void printNtimeshelper(int i, int n) {
        if (i <= n) {
            System.out.print(i + " ");
            printNtimeshelper(i + 1, n);
        }
    }
}