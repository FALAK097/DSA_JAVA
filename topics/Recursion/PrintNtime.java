import java.util.Scanner;

public class PrintNtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNtime(n);
        sc.close();
    }

    public static void printNtime(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello World");
        printNtime(n - 1);
    }
}

// Time & Space Complexity -
// Worst Case - O(n)