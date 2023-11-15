import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output -
// Enter the value of n: 5
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
