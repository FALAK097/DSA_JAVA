import java.util.Scanner;

public class ArraySortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSorted(n, arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();
    }

    public static boolean isSorted(int n, int arr[]) {
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }
}
