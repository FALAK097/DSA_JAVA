import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerotoEndOfArray(arr, n);
        System.out.println("Array after moving zeros to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void moveZerotoEndOfArray(int arr[], int n) {
        int j = 0;

        // Find the first zero
        while (j < n && arr[j] != 0) {
            j++;
        }

        // No non-zero numbers
        if (j == n) {
            return;
        }

        // Move non-zero numbers to the front
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
