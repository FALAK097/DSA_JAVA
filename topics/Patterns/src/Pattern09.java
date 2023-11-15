import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        nStarDiamond(n);
        sc.close();
    }

    public static void nStarDiamond(int n) {
        // Upward triangle
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Downward triangle
        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output -
// Enter the value of n: 5
///////// *
//////// ***
/////// *****
////// *******
///// *********
///// *********
////// *******
/////// *****
//////// ***
///////// *