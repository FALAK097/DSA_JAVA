import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // space
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            // star
            for (int col = 1; col <= 2 * n - (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output -
// Enter the value of n: 5
///// *********
////// *******
/////// *****
//////// ***
///////// *