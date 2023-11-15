import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

            sc.close();
        }
    }
}

// Output -
// Enter the value of n: 5
// * * * * *
// * * * *
// * * *
// * *
// *