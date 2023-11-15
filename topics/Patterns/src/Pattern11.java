import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row;
            if (row > n)
                stars = 2 * n - row;
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output -
// Enter the value of n: 5
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *