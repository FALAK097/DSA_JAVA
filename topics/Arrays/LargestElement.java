import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest(arr, n);
        sc.close();
    }

    public static void largest(int arr[], int n) {
        int large = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The largest element is: " + large);
    }
}