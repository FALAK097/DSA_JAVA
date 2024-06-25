import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array to be sorted: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionsort(n, arr);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void insertionsort(int n, int[] arr) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                arr[j - 1] = arr[j] + arr[j - 1] - (arr[j] = arr[j - 1]);
                j--;
            }
        }
    }
}

// Recursion code
// public class Solution {
// public static void insertionSort(int[] arr, int size) {
// // Base case: If the size is 1 or less, the array is already sorted
// if (size <= 1) {
// return;
// }

// // Sort the first (size-1) elements
// insertionSort(arr, size - 1);

// // Insert the last element into the sorted part of the array
// int currentElement = arr[size - 1];
// int j = size - 2;

// // Move elements greater than the currentElement to the right
// while (j >= 0 && arr[j] > currentElement) {
// arr[j + 1] = arr[j];
// j--;
// }

// // Insert the currentElement in its correct position
// arr[j + 1] = currentElement;
// }
// }
