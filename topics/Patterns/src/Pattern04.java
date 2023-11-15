import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");

        int n = sc.nextInt();

        pattern04(n);

        sc.close();
    }

    static void pattern04(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

// Output -
// Enter the value of n: 4
// 1
// 2 2
// 3 3 3
// 4 4 4 4
