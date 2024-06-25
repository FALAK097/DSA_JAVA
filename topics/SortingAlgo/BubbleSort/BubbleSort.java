import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array to be sorted: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(n, arr);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void bubblesort(int n, int[] arr) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = arr[j] + arr[j + 1] - (arr[j] = arr[j + 1]);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

// Recurison code
// public class Solution {
// public static void bubbleSort(int[] arr, int n) {
// // Base case: If the array is already sorted or has only one element, return
// if (n <= 1) {
// return;
// }

// // One pass of bubble sort to move the largest element to the end
// for (int i = 0; i < n - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// // Swap arr[i] and arr[i+1]
// arr[i + 1] = arr[i] + arr[i + 1] - (arr[i] = arr[i + 1]);
// }
// }

// // Recursively sort the remaining (n-1) elements
// bubbleSort(arr, n - 1);
// }
// }
